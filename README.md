Issue: When creating beans using the @Bean annotation despite the mySecondClass bean being present above the myFirstClass bean when we run the application we find that the myFirstClass bean is created first and the created service also injects the same bean.

Reason: While the order in the ApplicationContext file is defined such that mySecondClass comes before myFirstClass Java does not guarantee the order of methods in the source code will match the order in the compiled class file.
Spring processes @Bean methods in the order they appear in the compiled class, which might not align with their order in the source code and in most cases, Spring will process the myFirstClass bean first because of its alphabetical position in the compiled class file.
However even this behaviour is dependent upon the JVM. 
