# Project Plan
## Introduction
It's important we have an insight into the planning of the library, 
to make sure we product a system that works, and can be used anywhere.

There are several points to be considered throughout development, namely:
- Primarily, it must work on Linux, but it should also be compatible with Windows and MacOS
- Files produced as a result of processing should have some temporary nature (they mustn't stay for too long, but also must be available 
    for enough time to view them).

Let's get to the design then!

## Design:
The system should be called from one manager. Simply create an instance of the DCRawManager, and that should be it.

For example:

```java
DCRawManager myImage = new DCRawManager();

myImage.loadFromFile('/path/to/raw/file/afile.dng');

myImage.process();


```

While this might not be a fully extensive design, it shows the basics.

Essentially, we should be able to load from several different places, both the filesystem and from a server elsewhere (in the cloud).
Once options are set, we can then call the process command which will process the image into a file format (as specified in options).

If no options are specified (as above), then there shall be some default options that are followed. These should be documented.

There should also be the ability to specify options directly through an options maker.

```java
DCRawOptions myOptions = new DCOptions();
myOptions.setWB(WBSettings.CAMERA);
myOptions.setBrightnessGenerator(BrightnessGen.AUTOMATIC);
```

One can then pass this options maker into the main manager:

```java
...
myImage.setOptions(myOptions);
myImage.process();
```

Super simple!

That's the aim, as we don't want to make things too difficult.

For now, I'd make the entire the block before getting results, although it would be worth
designing a system that will allow a non-blocking approach. Blocking can be worked around by using it inside a separate thread
process (we will be using a socket based server, so it's not a major problem), but making it callback based would definitely be better.