# Spring的学习-day01

## 1.spring核心配置文件详解

- set属性注入:

  ```xml
  
  	<!-- 1.set属性注入
  		 	注意：(1)如果对象没有指定id，这个时候以类名作为id
  		 	    (2)set属性注入先调用无参构造器，再进行set方法调用
  	-->
  	<bean class="cn.itheima.entity.Student" id="student">
  		<!-- 通过set方法设置属性  -->
  		<property name="username" value="小明"></property>
  		<property name="sex" value="男"></property>
  		<property name="age" value="10"></property>
  	</bean>
  ```

- 构造器注入：

  ```xml
  <!-- 2.构造器注入 
  			注意：（1）用这种方式就不会调用无参的，会调用对应有参的
  				 (2) index：指当前参数在构造器中的下标，默认从0开始
  				 (3) type:参数类型，可以限制传递的参数类型
  				 (4) name:属性名
  -->
  	<bean class="cn.itheima.entity.Student" id="student2">
  		<constructor-arg value="小红" name="username"></constructor-arg>
  		<constructor-arg value="20" index="2" type="java.lang.Integer">            	       </constructor-arg>
  		<constructor-arg value="女" index="1"></constructor-arg>
  		<constructor-arg ref="grade"></constructor-arg>
  	</bean>
  ```

- 引用注入使用ref：

  ```xml
  <constructor-arg ref="grade"></constructor-arg>
  ```

- 内部bean的使用，内部bean不需要指定id，由于它只可以供内部使用

  ```xml
  <!-- 4.内部bean的使用，内部bean不需要指定id-->
  	<bean class="cn.itheima.entity.Student" id="student3">
  		<constructor-arg value="小红" name="username"></constructor-arg>
  		<constructor-arg value="20" index="2" type="java.lang.Integer">                     </constructor-arg>
  		<constructor-arg value="女" index="1"></constructor-arg>
  		<constructor-arg>
              <!-- 内部bean -->
  			<bean class="cn.itheima.entity.Grade">
  				<constructor-arg name="id" value="2"></constructor-arg>
  				<constructor-arg name="gradeName" value="高三二班"></constructor-arg>
  			</bean>
  		</constructor-arg>
  	</bean>
  ```

- 集合属性:list、map、properties属性注入

  ```xml
  <!-- 5.集合属性:list、map、properties
  			注意:传入的属性是list或者数组:使用list
  	 -->
  	<bean class="cn.itheima.entity.School" id="school">
  		<!-- 注入list属性 -->
  		<property name="studentList">
  			<list>
  				<ref bean="student"/>
  				<ref bean="student2"/>
  			</list>
  		</property>
  		
  		<!-- 注入map属性 -->
  		<property name="studentMap">
  			<map>
  				<entry key="one" value-ref="student"></entry>
  				<entry key="two" value-ref="student2"></entry>
  			</map>
  		</property>
  		
  		<!-- 注入properties -->
  		<property name="properties">
  			<props>
  				<prop key="url">jdbc:mysql://localhost:3306/database1</prop>
  				<prop key="username">root</prop>
  				<prop key="password">root</prop>
  			</props>
  		</property>
  	</bean>
  ```

- list集合属性的抽取，以及使用，其他的map,properties类似

  ```xml
  	<!-- 6.list集合属性的抽取 -->
  	<util:list id="students">
  			<ref bean="student"/>
  			<ref bean="student2"/>
  	</util:list>
  	
  	<!-- 引用抽取后的list属性 -->
  	<bean class="cn.itheima.entity.School" id="school2">
  		<property name="studentList">
  			<ref bean="students"/>
  		</property>
  	</bean>
  ```

- xml中的原样输出代码块:

  ```xml
  	<!-- 7.xml中的原样输出代码块
  		写法格式:<![CDATA[内容]]>
  	 -->
  	<bean class="cn.itheima.entity.Student" id="student4">
  		<property name="username">
  			<value><![CDATA[《小明》]]></value>
  		</property>
  	</bean>
  ```

- 使用p名称空间设置属性

  ```xml
  	<!-- 8.使用p名称空间设置属性-->
  	<bean class="cn.itheima.entity.Student" id="student5" 
            p:age="10" p:username="小智" p:sex="女">
  	</bean
  ```
