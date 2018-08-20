# SpringAopXmlBasedProject

### Creating Spring-Config.XML file
* Must include these two, in xsi:schemaLocation
```xml
    http://www.springframework.org/schema/aop   
    http://www.springframework.org/schema/aop/spring-aop-3.0.xsd"
```
* Must include
```xml
    <aop:aspectj-autoproxy/>
```
* Must register, Aspect classes as a bean, for IOC

### Add all advices and pointcut in Spring-Config.XML file
* Must add this directly into Spring-Config.XML file
```xml
  <aop:config>
	<aop:aspect ref="audience">
	<aop:before pointcut="execution(public void com.spring.aop.concert.Performance.perform())" method="takeSeats"/>
	<aop:before pointcut="execution(public void com.spring.aop.concert.Performance.perform())" method="silenceCellPhones"/>
	<aop:after-returning pointcut="execution(public void com.spring.aop.concert.Performance.perform())" method="applause"/>
	<aop:after-throwing pointcut="execution(public void com.spring.aop.concert.Performance.perform(int))" method="demandRefund"/>
	</aop:aspect>
  </aop:config>
```
