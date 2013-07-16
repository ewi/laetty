WEBHOME = ~/public_html/ewipublic/letut/
all: applet install
applet:
	javac src/LaettyApplet.java
install:
	install -m755 src/LaettyApplet.class html/LaettyApplet.class
clean:
	rm -f src/*.class
	rm -f html/LaettyApplet.class
publish:
	install -m755 html/LaettyApplet.class $(WEBHOME)
	install -m644 html/PanCakes.png $(WEBHOME)
	install -m644 html/letut.html $(WEBHOME)
	install -m644 html/letut.png $(WEBHOME)
