# oscar-ide

## Prerequisites
1. [Java SE Development Kit 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
(todo:) Add JDK to $PATH 
2. [Eclipse Oxygen](https://www.eclipse.org/oxygen/)
Eclipse IDE for Eclipse Committers
3. [Maven 3.5.4](https://maven.apache.org/download.cgi)
(todo:) Add Maven to $PATH 

## To compile OSCAR-IDE
1. Clone [**oscar-ide**](https://github.com/rubis-lab/oscar-ide)

`git clone https://github.com/rubis-lab/oscar-ide.git`

2. Invoke maven compiler
```bash
    cd oscar-ide
    mvn clean verify
```

3. Binary file generated at:
`/releng/org.rubis.oscar.product/target/products/OSCAR/$(PLATFORM)`
(todo:) script to copy binaries

## To import in Eclipse Oxygen
1. File - Import - Existing Projects into Workspace

2. Select root directory (oscar-ide)

3. Check Search for nested projects

4. Check all projects - Finish

(todo:) provide screenshot

## Project Structure

(todo:) provide description
/bundles
    /org.rubis.oscar.plugin1
    	...
    	