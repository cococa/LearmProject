// properties

// 1.stored propreties store constant and variable  values
//   - classes  and structures


// computed properties calculate a value
//   -  classes ，strutures， enum



// stored properties

struct FixedLengthRange{
    var firstValue : Int
    var length : Int
}

var rangeOfThreeItems = FixedLengthRange(firstValue: 0, length: 3)

rangeOfThreeItems .firstValue  = 6
rangeOfThreeItems .length = 10



// stored properties of constant structure instances

//if you create an instance of a structure that instance to a constant, you cannot modify the instance properties , even if they were dealared as variable properties

// *** this behavior is due to structures being value type, when an instance of a valueo is marked as a constant, so are all of its properties.

let rangeOfFourItems  = FixedLengthRange(firstValue: 10, length: 10)

//rangeOfFourItems .firstValue = 10   //this will report an error





//lazy stored properties

// a lazy stored property is a propertu  whose initial value is not calculated  util the first time it is used, you indecate a lazy stored property  by writing the lazy  modifier before its declaration.

// you must always declare a lazy property as a variable


class DataImport {
    var filename = "data.txt"
}

class DataManager {
    lazy var importer = DataImport()
    var date = [String]()
}

let manager = DataManager()
manager.date.append("new date")
manager.date.append("1949")
// the DataImport instance for the importer property has not yet been crrated


manager.importer.filename
// has been created

// **  lazy property is not thread safe



// computed properties


// example

struct Point{
    var x  = 0.0 , y = 0.0
}
struct Size {
    var width  = 0.0 , height = 0.0
}

struct Rect{
    var origin = Point()
    var size = Size ()
    
    var center : Point{
        set (newCenter){
            origin.x = newCenter.x -  (size.width / 2 )
            origin.y = newCenter.y - (size.height / 2)
        }
        get{
               let centerX = origin.x + (size.width / 2)
                let centerY = origin.y + (size.height / 2)
                return Point(x: centerX, y: centerY)
        }
    }
}

var square = Rect(origin: Point(x: 0.0 , y: 0.0 ), size: Size(width: 10.0, height: 10.0))

let initialSquareCenter = square.center

square.center = Point(x: 20.0, y: 20.0)

square.origin.x
square.origin.y



class Person{
    
    var realName : String = ""
    var name : String {
        set{
            //shorthand setter
            realName = "real \(newValue)"  // use newValue
        }
        get{
            return realName
        }
    }
}

var p1  = Person()
p1.name = "cocoa"
p1.name




// read-only computed properties
// a computed property with a geter but not setter is known as a  read-only computed property, A read-only computed property always returns a value, and canbe accessed through dit syntax, but cannot be set to a different value.

struct Cuboid {
    var width = 0.0 , height = 0.0 ,depth = 0.0
    var volume : Double{
        return width * height * depth
    }
}

let cuboid  = Cuboid(width: 1.0, height: 2.0, depth: 3.0)
cuboid.volume
//cuboid.volume = 1.0  //error: cannot assign to property: 'volume' is a get-only property



// property obervers



// willSet is called just before the value is stored
// didSet is called immediately after the new value is stored.



































































