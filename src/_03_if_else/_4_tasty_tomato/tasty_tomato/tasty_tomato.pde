void setup() {
    size(500, 500);
}
void draw() {
    fill (#FFFFFF);
    background(200, 200, 200);
    noStroke();
    fill (#FF0505);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill (#32FF05);
    rect(176, 103, 12, 32);
    if (mousePressed) {
    fill (#C6C6C6);
    ellipse(275,200,50,50);
    }
    
}
