JAVAC=javac
JFLAGS = -g
sources = $(wildcard *.java)
classes = $(sources:.java=.class)

all: $(classes)

clean :
	rm -f *.class

%.class : %.java
	$(JAVAC) $(JFLAGS) $<
