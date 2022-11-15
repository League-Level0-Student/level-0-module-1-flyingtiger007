PImage pepperoni;
PImage mushroom;
PImage olive;
void setup() {
size(600, 600);    
}
void draw() {
fill(#6A4747);
ellipse(300, 300, 400, 400);
fill (#FF0808);
ellipse(300, 300, 375, 375);
fill (#FFE708);
ellipse(300, 300, 370, 370);
pepperoni = loadImage("pepperoni.png");
mushroom = loadImage("mushroom.png");
if (mousePressed && (mouseButton == RIGHT)) {
image(pepperoni,400,332);
image(pepperoni,287,192);
image(pepperoni,214,232);
image(pepperoni,398,297);
image(pepperoni,237,332);
image(mushroom,264,218);
image(mushroom,365,258);
image(mushroom,276,398);
image(mushroom,152,423);
image(mushroom,357,214);
image(mushroom,198,167);
image(mushroom,254,387);
}
}
