# Eclipse AVSys

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
    	
## Sample OSCAR IDE Project
1. Open OSCAR IDE
   - On Linux go to `oscar-ide/repository/target/products/oscar.product/linux/gtk/x86_64`
   - On MacOS X go to `oscar-ide/repository/target/products/oscar.product/macosx/cocoa/x86_64/Eclipse.app/Contents`
   - On Windows go to `oscar-ide/repository/target/products/oscar.product/win32/win32/x86_64`
   - Run `eclipse` executable 

2. Create new project
   - Right-click in the Project Explorer view, and select `New -> Project`
   - Select `General -> Project` and click `Next`
   - Type the `Project name` starting with "My" and click `Finish`
   - (Currently we recommend naming the project starting with "My")

3. Create new model
   - Right-click on the project in the Project Explorer view, and select `New -> Other...`
   - Select `Example EMF Model Creation Wizards -> Oscar Model`
   - Type the `File name` with `My.oscar` extension
   - (Currently we recommend naming the file as `My.oscar`)
   - Under `Model Object` select `OSCAR Object Process Diagram`
   - Under `XML Encoding` select `UTF-8`
   - Click `Finish`

4. Create new block diagram
   - Right-click on the model in the Project Explorer view, and select `Open With -> OSCAR Editor`
   - In the Palette view, select `Node` or `Topic`
   - Draw a block by clicking anywhere inside the OSCAR Editor area and dragging the cursor
   - Enter property values in the Properies view 
   - To create a link, select `Link` in the Palette view and click on two blocks you want to connect

5. Generate XML file & ROS skeleton code (C++)
   - Press `Run` menu on the top-left corner of IDE 
   - Under the `Run` menu select `Run Configuration`
   - Press `Run` button
   - Find `data.xml` file in the top level folder
   - Find skeleton code in `my_package/src` directory in the top level folder    

6. Transfer files to remote target
   - Enter values for `Address`, `FTP Port`, `User`, `Password`, `Location`
   - Press `Run`
   
7. Building and launching
   - Find contents of `my_package` on the target device
   - Run generated launch scripts from `my_package/src/launch`

