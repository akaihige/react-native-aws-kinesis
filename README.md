
# react-native-amazon-kinesis

## Getting started

`$ npm install react-native-amazon-kinesis --save`

### Mostly automatic installation

`$ react-native link react-native-amazon-kinesis`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNAmazonKinesisPackage;` to the imports at the top of the file
  - Add `new RNAmazonKinesisPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-amazon-kinesis'
  	project(':react-native-amazon-kinesis').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-amazon-kinesis/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-amazon-kinesis')
  	```


## Usage
```javascript
import RNAmazonKinesis from 'react-native-amazon-kinesis';

// TODO: What to do with the module?
RNAmazonKinesis;
```
  