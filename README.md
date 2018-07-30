Enhanced NavigationView
===================

[![CircleCI](https://circleci.com/gh/florent37/EnhancedNavigationView/tree/master.svg?style=svg)](https://circleci.com/gh/florent37/EnhancedNavigationView/tree/master)
[![Language](https://img.shields.io/badge/compatible-java%20%7C%20kotlin%20%7C%20rx-brightgreen.svg)](https://www.github.com/florent37/EnhancedNavigationView)

[![screen](https://raw.githubusercontent.com/florent37/EnhancedNavigationView/master/medias/video-large.gif)](https://www.github.com/florent37/EnhancedNavigationView)

# Usage

[ ![Download](https://api.bintray.com/packages/florent37/maven/enhanced-navigationview/images/download.svg) ](https://bintray.com/florent37/maven/enhanced-navigationview/)
```
dependencies {
    implementation 'com.github.florent37:enhanced-navigationview:(lastest version)'
}
```

EnhancedNavigationView extends google *BottomNavigationView*

look at https://developer.android.com/reference/com/google/android/material/bottomnavigation/BottomNavigationView

```xml
<com.github.florent37.enhancednavigationview.EnhancedNavigationView
            android:id="@+id/bottom_navigation"
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:background="@color/colorBottomBar"
            app:elevation="0dp"
            app:itemIconTint="@color/nav_item_state_list"
            app:itemTextColor="@color/nav_item_state_list"
            app:menu="@menu/bottom_navigation_items" />
```

# How to Contribute

We welcome your contributions to this project. 

The best way to submit a patch is to send us a [pull request](https://help.github.com/articles/about-pull-requests/). 

To report a specific problem or feature request, open a new issue on Github. 

# Credits

Author: Florent Champigny [http://www.florentchampigny.com/](http://www.florentchampigny.com/)

Blog : [http://www.tutos-android-france.com/](http://www.tutos-android-france.com/)

<a href="https://goo.gl/WXW8Dc">
  <img alt="Android app on Google Play" src="https://developer.android.com/images/brand/en_app_rgb_wo_45.png" />
</a>

<a href="https://plus.google.com/+florentchampigny">
  <img alt="Follow me on Google+"
       src="https://raw.githubusercontent.com/florent37/DaVinci/master/mobile/src/main/res/drawable-hdpi/gplus.png" />
</a>
<a href="https://twitter.com/florent_champ">
  <img alt="Follow me on Twitter"
       src="https://raw.githubusercontent.com/florent37/DaVinci/master/mobile/src/main/res/drawable-hdpi/twitter.png" />
</a>
<a href="https://www.linkedin.com/in/florentchampigny">
  <img alt="Follow me on LinkedIn"
       src="https://raw.githubusercontent.com/florent37/DaVinci/master/mobile/src/main/res/drawable-hdpi/linkedin.png" />
</a>

# License

    Copyright 2018 florent37, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
