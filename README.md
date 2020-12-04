# Learning_Java_5th_Ed
Book description

If you’re new to Java—or new to programming—this best-selling book will guide you through the language features and APIs of Java 11. With fun, compelling, and realistic examples, authors Marc Loy, Patrick Niemeyer, and Daniel Leuck introduce you to Java fundamentals—including its class libraries, programming techniques, and idioms—with an eye toward building real applications.

You’ll learn powerful new ways to manage resources and exceptions in your applications—along with core language features included in recent Java versions.

    Develop with Java, using the compiler, interpreter, and other tools
    Explore Java’s built-in thread facilities and concurrency package
    Learn text processing and the powerful regular expressions API
    Write advanced networked or web-based applications and services

Table of contents

    Preface
        Who Should Read This Book
        New Developments
            New in This Edition (Java 11, 12, 13, 14)
        Using This Book
        Online Resources
        Conventions Used in This Book
        Using Code Examples
        O’Reilly Online Learning
        How to Contact Us
        Acknowledgments
    1. A Modern Language
        Enter Java
            Java’s Origins
            Growing Up
        A Virtual Machine
        Java Compared with Other Languages
        Safety of Design
            Simplify, Simplify, Simplify…
            Type Safety and Method Binding
            Incremental Development
            Dynamic Memory Management
            Error Handling
            Threads
            Scalability
        Safety of Implementation
            The Verifier
            Class Loaders
            Security Managers
        Application and User-Level Security
        A Java Road Map
            The Past: Java 1.0–Java 11
            The Present: Java 14
            The Future
            Availability
    2. A First Application
        Java Tools and Environment
            Installing the JDK
            Installing OpenJDK on Linux
            Installing OpenJDK on macOS
            Installing OpenJDK on Windows
            Configuring IntelliJ IDEA and Creating a Project
            Running the Project
            Grabbing the Learning Java Examples
        HelloJava
            Classes
            The main() Method
            Classes and Objects
            Variables and Class Types
            HelloComponent
            Inheritance
            The JComponent Class
            Relationships and Finger-Pointing
            Package and Imports
            The paintComponent() Method
        HelloJava2: The Sequel
            Instance Variables
            Constructors
            Events
            The repaint() Method
            Interfaces
        Goodbye and Hello Again
    3. Tools of the Trade
        JDK Environment
        The Java VM
        Running Java Applications
            System Properties
        The Classpath
            javap
            Modules
        The Java Compiler
        Trying Java
        JAR Files
            File Compression
            The jar Utility
            The pack200 Utility
        Building Up
    4. The Java Language
        Text Encoding
        Comments
            Javadoc Comments
        Variables and Constants
        Types
            Primitive Types
            Reference Types
            Inferring Types
            Passing References
            A Word About Strings
        Statements and Expressions
            Statements
            Expressions
        Arrays
            Array Types
            Array Creation and Initialization
            Using Arrays
            Anonymous Arrays
            Multidimensional Arrays
        Types and Classes and Arrays, Oh My!
    5. Objects in Java
        Classes
            Declaring and Instantiating Classes
            Accessing Fields and Methods
            Static Members
        Methods
            Local Variables
            Shadowing
            Static Methods
            Initializing Local Variables
            Argument Passing and References
            Wrappers for Primitive Types
            Method Overloading
        Object Creation
            Constructors
            Working with Overloaded Constructors
        Object Destruction
            Garbage Collection
        Packages
            Importing Classes
            Custom Packages
            Member Visibility and Access
            Compiling with Packages
        Advanced Class Design
            Subclassing and Inheritance
            Interfaces
            Inner Classes
            Anonymous Inner Classes
        Organizing Content and Planning for Failure
    6. Error Handling and Logging
        Exceptions
            Exceptions and Error Classes
            Exception Handling
            Bubbling Up
            Stack Traces
            Checked and Unchecked Exceptions
            Throwing Exceptions
            try Creep
            The finally Clause
            try with Resources
            Performance Issues
        Assertions
            Enabling and Disabling Assertions
            Using Assertions
        The Logging API
            Overview
            Logging Levels
            A Simple Example
            Logging Setup Properties
            The Logger
            Performance
        Real-World Exceptions
    7. Collections and Generics
        Collections
            The Collection Interface
            Collection Types
            The Map Interface
        Type Limitations
            Containers: Building a Better Mousetrap
            Can Containers Be Fixed?
        Enter Generics
            Talking About Types
        “There Is No Spoon”
            Erasure
            Raw Types
        Parameterized Type Relationships
            Why Isn’t a List<Date> a List<Object>?
        Casts
            Converting Between Collections and Arrays
            Iterator
        A Closer Look: The sort() Method
        Application: Trees on the Field
        Conclusion
    8. Text and Core Utilities
        Strings
            Constructing Strings
            Strings from Things
            Comparing Strings
            Searching
            String Method Summary
        Things from Strings
            Parsing Primitive Numbers
            Tokenizing Text
        Regular Expressions
            Regex Notation
            The java.util.regex API
        Math Utilities
            The java.lang.Math Class
            Big/Precise Numbers
        Dates and Times
            Local Dates and Times
            Comparing and Manipulating Dates and Times
            Time Zones
            Parsing and Formatting Dates and Times
            Parsing Errors
            Timestamps
        Other Useful Utilities
    9. Threads
        Introducing Threads
            The Thread Class and the Runnable Interface
            Controlling Threads
            Death of a Thread
        Synchronization
            Serializing Access to Methods
            Accessing Class and Instance Variables from Multiple Threads
        Scheduling and Priority
            Thread State
            Time-Slicing
            Priorities
            Yielding
        Thread Performance
            The Cost of Synchronization
            Thread Resource Consumption
        Concurrency Utilities
    10. Desktop Applications
        Buttons and Sliders and Text Fields, Oh My!
            Component Hierarchies
            Model View Controller Architecture
            Labels and Buttons
            Text Components
            Other Components
        Containers and Layouts
            Frames and Windows
            JPanel
            Layout Managers
        Events
            Mouse Events
            Action Events
            Change Events
            Other Events
        Modals and Pop Ups
            Message Dialogs
            Confirmation Dialogs
            Input Dialogs
        Threading Considerations
            SwingUtilities and Component Updates
            Timers
        Next Steps
            Menus
            Preferences
            Custom Components and Java2D
            JavaFX
        User Interface and User Experience
    11. Networking and I/O
        Streams
            Basic I/O
            Character Streams
            Stream Wrappers
            The java.io.File Class
            File Streams
            RandomAccessFile
        The NIO File API
            FileSystem and Path
            NIO File Operations
        The NIO Package
            Asynchronous I/O
            Performance
            Mapped and Locked Files
            Channels
            Buffers
            Character Encoders and Decoders
            FileChannel
        Network Programming
        Sockets
            Clients and Servers
            The DateAtHost Client
            A Distributed Game
        More to Explore
    12. Programming for the Web
        Uniform Resource Locators
        The URL Class
            Stream Data
            Getting the Content as an Object
            Managing Connections
            Handlers in Practice
            Useful Handler Frameworks
        Talking to Web Applications
            Using the GET Method
            Using the POST Method
            The HttpURLConnection
            SSL and Secure Web Communications
        Java Web Applications
            The Servlet Life Cycle
            Servlets
            The HelloClient Servlet
            The Servlet Response
            Servlet Parameters
            The ShowParameters Servlet
            User Session Management
            The ShowSession Servlet
        Servlet Containers
            Configuration with web.xml and Annotations
            URL Pattern Mappings
            Deploying HelloClient
        The World Wide Web Is, Well, Wide
    13. Expanding Java
        Java Releases
            JCP and JSRs
        Lambda Expressions
            Retrofitting Your Code
        Expanding Java Beyond the Core
        Final Wrap-Up and Next Steps
    A. Code Examples and IntelliJ IDEA
        Grabbing the Main Code Examples
        Installing IntelliJ IDEA
            Installing on Linux
            Installing on a macOS
            Installing on Windows
        Importing the Examples
        Running the Examples
        Grabbing the Web Code Examples
        Working with Servlets
    Glossary
    Index
