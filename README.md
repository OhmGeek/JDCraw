[![Build Status](https://travis-ci.org/OhmGeek/JDCraw.svg?branch=master)](https://travis-ci.org/OhmGeek/JDCraw)
[![codebeat badge](https://codebeat.co/badges/5b0bcc7b-10af-406f-84f8-5cb78b990a11)](https://codebeat.co/projects/github-com-ohmgeek-jdcraw-master)
# JDCraw
## Introduction
When investigating the use of RAW processing with Java, I found there weren't many useful tools available.
DCRaw is the standard way of processing RAW images, but there was no Java library available.

JDCraw is simply a wrapper around the executable, which provides function calls that equally call functions on the executable. This isn't the nicest option, but to me it appeared nicer than using JNI (and slightly quicker for proof of concept).

The current system is very much **in development**, and as such, I wouldn't yet use it in a production system. 

## Dependencies
The project relies on Maven.

This project relies on the [DCRaw executable](https://www.cybercom.net/~dcoffin/dcraw/dcraw.1.html), built by Dave Coffin. Depending on your operating system, you can install it as follows:
### DCRaw Executable
#### Linux:
Install using the built in package manager.

For Debian/Ubuntu:
```bash
sudo apt-get install dcraw
```

For Fedora:
```bash
sudo yum install dcraw
```

#### macOS
First, install the [brew](https://github.com/Homebrew/brew) package manager, if you haven't already.

Then, open Terminal and run the following:

```bash
sudo brew install dcraw
```

## Tests:
There are some tests, but these are not entirely comprehensive. To run the ones present, use Maven:

```bash
mvn test
```

## License:
Licensed under the MIT License.

DCRaw is licensed under the LGPLv2 license. 
