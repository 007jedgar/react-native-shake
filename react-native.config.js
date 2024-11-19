/**
 * @type {import('@react-native-community/cli-types').UserDependencyConfig}
 */
module.exports = {
  dependency: {
    platforms: {
      android: {
        cmakeListsPath: 'generated/jni/CMakeLists.txt',
      },
    },
  },
  project: {
    codegenConfig: {
      name: 'NativeShakeSpec',
      jsSrcsDir: './src',
      androidDir: './android',
      androidPackage: 'com.rnshake',
      libraryName: 'RNShake',
    },
  },
};
