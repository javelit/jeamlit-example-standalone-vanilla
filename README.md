# jeamlit-example-standalone-vanilla
Example Jeamlit app that you can fork. 
**Standalone setup.** .

The key file to look at is [App.java](App.java).  
More details about this example project are available in the [documentation](https://docs.jeamlit.io/get-started/installation/standalone-without-build-tool).

## Requirements

`Java JDK >= 21`

## Installation

Install Jeamlit:

### With [JBang](https://www.jbang.dev/) (recommended):
```bash
jbang app install io.jeamlit:jeamlit:0.44.0:all
```

### With curl:

```bash
curl -L -o jeamlit.jar https://repo1.maven.org/maven2/io/jeamlit/jeamlit/0.44.0/jeamlit-0.44.0-all.jar
```

## Run 

### with jbang
```bash
jeamlit run App.java
```

### with java CLI
```
java -jar jeamlit.jar run App.java
```

## Development
- Make sure to install the [JBang plugins](https://plugins.jetbrains.com/plugin/18257-jbang) to benefit from code completion and highlighting.
- Edit the file, the app will reload automatically.
  For instance, add:
  ```java
  Jt.markdown("**OMG THE HOT-RELOAD IS REAL**").use();
  ```
    


