# Drools Anypoint Connector

Drools is a Business Logic integration Platform. It provides a core Business Rules Engine (BRE) It is a collection of tools that allow us to separate and reason over logic and data found within business processes. Drools is a Rule Engine that uses the rule-based approach to implement and Expert System. The Rule Engine matches facts and data against Production Rules to infer conclusions which result in actions. A Rule Engine allows you to define "What to Do" and not "How to do it. 

Facts are stored in a working memory (something like an in-memory database). A fact is a piece of data, such as "age = 40", or in an object-oriented rules engine, it may be a Java object with properties.

Rules are defined in a knowledge base. A rule consists of conditions (which typically depend on facts in the working memory) and actions which are executed when the conditions are true (similar to an "if-then" statement). Rules are pieces of knowledge often expressed as, "When some conditions occur, then do some tasks. The action executed by a rule may change facts in the working memory which then cause other rules to fire.	

# Mule supported versions
Mule 3.8.x, 3.7.x

# Drools supported versions
Drools 6.4.0 and above.

# Motivation
In many applications, the business logic changes more frequently than the rest of the application code. A Rules Engine executes business rules that have been externalized from the rest of the application. This externalization of business logic makes the application more adaptable to change, and may even allow non-technical personnel to update the business logic without the intervention of an developer. 

# Installation 
For beta connectors you can download the source code and build it with devkit to find it available on your local repository. Then you can add it to Studio.
You have to install Java jdk, Apache Maven, Anypoint Studio, and Anypoint DevKit Plugin to install your connector. You can develop a connector using Windows, Mac, or Linux.
In Anypoint Studio,Click File > Import > Anypoint Studio > Anypoint Connector Project from External Location, choose a URL or a .zip file, and complete the wizard to locate and import the project.
Then Right Click on the project folder Anypoint Connector > Install or update. 
The Drools Connector will be installed and it appears in the Connectors pallette on the right side of Anypoint Studio. You can now use your connector in your application by drag and drop from the pallette.

#Usage
This connector can be used in any application. After drag and drop, We need to select "execute operation" from operation dropdown and then we need to provide path for .drl file. Data can be provided from db, file or payload etc. And After firing all rules(given inside .drl file), it will give output as JSON format. We need to format that output accordding to our reqquirement such as saving to file or another table in db etc. 

# Reporting Issues
We use GitHub:Issues for tracking issues with this connector. You can report new issues at this link http://github.com/mulesoft/drools/issues.
