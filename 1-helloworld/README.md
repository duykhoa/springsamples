### Description

Run the example and take a look at the log

Two important things here `@SpringBootApplication` and `@Component`

List of all dependencies for this module

Go back after `2-how-does-it-work`

Modify the `Application` code
```java
Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
```

Take a look at the methods
```java
DefaultListableBeanFactory.registerBeanDefinition(..)
DefaultListableBeanFactory.getBean(..)
ClassPathScanningCandidateComponentProvider.registerDefaultFilters(..)
```


### Exercise
1. change `@Component` to `@Repository`, `@Service`, `@Controller`, is it any difference?
2. move `Application` to new created package, e.g. `app` and run the code, what has happened?
3. create breakpoint in `HelloWorld` constructor, run the code

### Answers
1. [stack overflow](https://stackoverflow.com/questions/6827752/whats-the-difference-between-component-repository-service-annotations-in)