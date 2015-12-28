clear()
val lineLength = 100
val turn = 90
val turnAround = 180

// Draw R
def drawR() {
forward(100)
  right(90)
  repeat(90) {
    forward(1)
    right(2)
  }
  right(180)
  repeat(40) {
    forward(1)
    right(90)
    forward(1)
    left(90)
  }
  penUp()
  forward(20)
  penDown()
}

def drawDot() {
  repeat(45) {
    forward(1)
    left(8)
  }
}

def drawT() {
  penUp()
  forward(40)
  penDown()
  left(90)
  forward(100)
  left(90)
  penUp()
  forward(30)
  penDown()
  left(180)
  forward(60)
  right(90)
  penUp()
  forward(100)
  penDown()
  left(90)
}

drawR()
drawDot()
drawT()
drawDot()

// move the turtle out of the way
penUp()
forward(50)
