/*
 * Copyright (C) 2013-2014, Infthink (Beijing) Technology Co., Ltd. All Rights Reserved. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package com.firefly.sample.castcompanionlibrary.cast.callbacks;

import tv.matchstick.fling.ApplicationMetadata;
import tv.matchstick.fling.FlingDevice;
import tv.matchstick.fling.Status;

/**
 * A no-op implementation of the {@link IDataCastConsumer}
 */
public class DataCastConsumerImpl extends BaseCastConsumerImpl implements IDataCastConsumer {

    @Override
    public void onApplicationConnected(ApplicationMetadata appMetadata, String applicationStatus,
             boolean wasLaunched) {
    }

    @Override
    public void onApplicationDisconnected(int errorCode) {
    }

    @Override
    public void onApplicationStopFailed(int errorCode) {
    }

    @Override
    public boolean onApplicationConnectionFailed(int errorCode) {
        return true;
    }

    @Override
    public void onApplicationStatusChanged(String appStatus) {

    }

    @Override
    public void onVolumeChanged(double value, boolean isMute) {
    }

    @Override
    public void onMessageReceived(FlingDevice flingDevice, String namespace, String message) {
    }

    @Override
    public void onMessageSendFailed(Status status) {
    }

    @Override
    public void onRemoved(FlingDevice flingDevice, String namespace) {
    }

}
