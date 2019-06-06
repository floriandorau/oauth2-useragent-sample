# oauth2-useragent-sample #

## Getting started ##

Clone the repository to your local machine

```bash
git clone git@github.com:floriandorau/oauth2-useragent-sample.git
```

and got to `src`

```bash
cd src
```

After that compile the `Main` class from there.

```bash
javac -classpath .:../oauth2-useragent-0.11.3.jar Main.java
```   

Finally you can run `Main` to start the oauth2-useragent.

```bash
java -classpath .:../oauth2-useragent-0.11.3.jar Main
```

### Note ###
You might need to use `;` instead of `:` on a Windows machine when defining the classpath 
[see here].(https://stackoverflow.com/a/17408791)
