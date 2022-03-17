package com.example.flutter_appcenter_poc
import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import io.flutter.plugins.GeneratedPluginRegistrant
class MainActivity: FlutterActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      AppCenter.start(application, "6c35a863-b9d3-49ed-a3a9-e165197d43ca", Analytics::class.java, Crashes::class.java)
   }
}
