PImage face; 
void setup() {
face = loadImage("zombie.jpeg");
size (600,600);
}
void draw() {
face.resize(600,600);
image(face,0,0);
ellipse(230,275,75,75);
ellipse(410,235,75,75);
fill(100, mouseY, mouseX);
}
