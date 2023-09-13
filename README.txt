a4j (Amazon AWS for Java)
Ken Cochrane
Ken@PopcornMonsters.com
http://www.KenCochrane.net/a4j/
08-01-2003

#INTRODUCTION#
a4j was developed to make dealing with the Amazon.com XML web service easier
using java. It provided a very simple api that you would use to access amazon
to get the data that you want. The API handles all connections to Amazon.com
as well as any XML parsing. It lets the developer play with easy to understand
Java objects instead of large XML files. It also provideds a simple level of
caching.

Current version is 1.0 Beta 1 if you tried it out and you like it or even if you
don't please let me know what you think, either way.
Ken@PopcornMonsters.com

It isn't 100% finished yet, I have only implemented the features that I currently
need, if you would like a feature goto the a4j sourceforge.net page and put in
the feature request. Or better yet, write it yourself and send me the code and i'll
add it to the api. I will even put your name on the developers list.

You will probably notice a lot of spelling mistakes, right now I am more worried about
getting the API up and functional and less about making sure all of the spelling is
correct.

#REQUIREMENT#
I only have one major requirement when it comes to a4j, if you use it please
give us credit, put a link back to our home page so that others can find out
about us as well. If you use the tool let us know and we will put your name
and link on our website. Everyone knows that google loves links, the link
on our site to yours will only help you.

#SETUP#
Unzip the a4j zip file and you will find the following directories

build - all of the compiled java classes for a4j
config -  the configuration files used by a4j
dist -  the location of the a4j.jar file
docs - javadocs and any other documentation for the project
examples - some simple examples to help you understand how the api works
jars - jar files that are required in order to use a4j, make sure these are in your classpath
src - the source code for a4j. if you make any changes for the better send them my way.

-=Adding jars to classpath=-
once the zip file is uncompressed take the jar files out of the dist and jars directories and
add them to your classpath for your application.

-=changing the config files=-
alter the a4j-config.txt file so that it has all of your information. If you don't the api won't run
Once it is all setup you need to place the a4j-config.txt file at the base of your application classpath.
Did I lose you with that last one. Let me give you an example. If you have an application with the following
package structure net.kencochrane.blah.fun which means you have a directory structure like this
net\kencochrane\blah\fun the config file needs to be at the same level as the net directory. If you don't use
any packages in your files that you just need you config file in the same directory as all of your classes. Basically
the config file needs to be at the top of any of your class directories. if you are still lost look where it is located
in the src directory in this zip file.

#Using The API#

Create a new a4j object.
A4j a4j = new A4j();

Once you have a new object you can then call any one of its methods. Look at the javadocs
for full list of the methods and their parameters and what java beans they return.

getFullProductFromASIN
BlendedSearch
KeywordSearch
etc.

Once you have decided on a method and passed in the required parameters you will get
back a java object or java bean if you will. Some objects are nothing but arrays of
other objects, others will have getters and setters for all of the information that you
want to get. All that you should have to worry about is the getters, so call the getter methoded
for what ever property that you want and then do what you want with it. It should be noted
that if the property doesn't have a method it will return null, so you should always check if
the value isn't null before you play with it, or else you will get the lovely nullPointerException errors
that everyone loves so much.

To make things very simple you should always go through the A4j class for all of your requests.
It abstracts you from all that is happening in the backend, the interface won't change as we make improvements
but the backend will, so if you only go through the A4j class you won't have to worry about having
to change any of your code with future releases. The changes in the backend won't affect you at all. And
that is why I don't recommend going thru the DAO's directly.

#Getting help#
This project is hosted by the lovely people at sourceforge.net if you have any problems goto
the a4j page and post your problems,questions or bugs to the appropriate pages.
http://sourceforge.net/projects/a4j/


