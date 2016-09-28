# Drools Anypoint Connector

Drools is a Business Logic integration Platform. It provides a core Business Rules Engine (BRE) It is a collection of tools that allow us to separate and reason over logic and data found within business processes. Drools is a Rule Engine that uses the rule-based approach to implement and Expert System. The Rule Engine matches facts and data against Production Rules to infer conclusions which result in actions. A Rule Engine allows you to define "What to Do" and not "How to do it. This externalization of business logic makes the application more adaptable to change, and may even allow non-technical personnel to update the business logic without the intervention of an developer.

Facts are stored in a working memory (something like an in-memory database). A fact is a piece of data, such as "age = 40", or in an object-oriented rules engine, it may be a Java object with properties.

Rules are defined in a knowledge base. A rule consists of conditions (which typically depend on facts in the working memory) and actions which are executed when the conditions are true (similar to an "if-then" statement). Rules are pieces of knowledge often expressed as, "When some conditions occur, then do some tasks. The action executed by a rule may change facts in the working memory which then cause other rules to fire.	

# Mule supported versions

Mule 3.8.x, 3.7.x

# Drools supported versions
Example:
Drools 6.4.0 and above.

# Installation 
For beta connectors you can download the source code and build it with devkit to find it available on your local repository. Then you can add it to Studio

For released connectors you can download them from the update site in Anypoint Studio. 
Open Anypoint Studio, go to Help → Install New Software and select Anypoint Connectors Update Site where you’ll find all avaliable connectors.

#Usage
For information about usage our documentation at http://github.com/mulesoft/drools.

# Reporting Issues

We use GitHub:Issues for tracking issues with this connector. You can report new issues at this link http://github.com/mulesoft/drools/issues.