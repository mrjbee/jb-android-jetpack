# Subscriber

Subscriber usage, where `exemple.MessageSubscriber extends org.monroe.team.android.jetpack.pebble.AbstractMessageSubscriber`

```xml
    <receiver
            android:name="exemple.MessageSubscriber"
            android:enabled="true" android:exported="true">
                <intent-filter>
                    <action android:name="com.getpebble.action.app.RECEIVE" />
                </intent-filter>
        </receiver>
```