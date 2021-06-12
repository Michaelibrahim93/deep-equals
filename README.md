# deep-equals
it's a library that compares every value in recursive way to 
check if all value are equals or not using "Java reflection".

# Gradle
```
    ...
    implementation 'io.github.Michaelibrahim93:deep-equals-lib:1.0.0-Beta'
```
 
# Maven
```
    ...
    <dependency>
      <groupId>io.github.Michaelibrahim93</groupId>
      <artifactId>deep-equals-lib</artifactId>
      <version>1.0.0-Beta</version>
      <classifier>javadoc</classifier>
    </dependency>
``` 

# Usage
```
    val user1 = User(1, "Michael", "Ibrahim")
    val user2 = User(1, "Michael", "Ibrahim")
    Log.d(TAG, "deep equals: ${DeepEquals.deepEquals(user1, user2)}")//true
    
    user2.lName = "Abd Al-Massih"
    Log.d(TAG, "deep equals: ${DeepEquals.deepEquals(user1, user2)}")//false
```

#Annotations
```
data class KObject(
    val mString: String,
    val mDouble: Double,
    val mInt: Int,
    val mFloat: Float,
    @IgnoreDeepEquals //this field will not be checked.
    val ignoredValue: Float
    @ShallowEquals //this field will be checked using equals method not deepEquals.
    val user: User
)
```
