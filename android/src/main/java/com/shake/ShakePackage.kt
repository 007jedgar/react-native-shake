package com.shake

import com.facebook.react.TurboReactPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.NativeModule
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.module.model.ReactModuleInfo
import java.util.HashMap

class ShakePackage : TurboReactPackage() {
  override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
    return if (name == ShakeModule.NAME) {
      ShakeModule(reactContext)
    } else {
      null
    }
  }

 override fun getReactModuleInfoProvider() = ReactModuleInfoProvider {
   mapOf(
     ShakeModule.NAME to ReactModuleInfo(
       ShakeModule.NAME,
       ShakeModule.NAME,
       false, // canOverrideExistingModule
       false, // needsEagerInit
       true, // hasConstants
       false, // isCxxModule
       true // isTurboModule
     )
   )
 }
}
