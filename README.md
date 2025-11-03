# javelit-example-standalone-vanilla
Example Javelit app that you can fork. 
**Standalone setup.** .

The key file to look at is [App.java](App.java).  
More details about this example project are available in the [documentation](https://docs.javelit.io/get-started/installation/standalone-without-build-tool).

## Requirements

`Java JDK >= 21`

## Installation

Install Javelit:

### With [JBang](https://www.jbang.dev/) (recommended):
```bash
jbang app install javelit@javelit
```

### With curl:

```bash
curl -L -o javelit.jar https://repo1.maven.org/maven2/io/javelit/javelit/0.60.0/javelit-0.60.0-all.jar
```

## Run 

### with jbang
```bash
javelit run App.java
```

### with java CLI
```
java -jar javelit.jar run App.java
```

## Development
- Make sure to install the [JBang plugins](https://plugins.jetbrains.com/plugin/18257-jbang) to benefit from code completion and highlighting.
- Edit the file, the app will reload automatically.
  For instance, add:
  ```java
  Jt.markdown("**OMG THE HOT-RELOAD IS REAL**").use();
  ```
    


