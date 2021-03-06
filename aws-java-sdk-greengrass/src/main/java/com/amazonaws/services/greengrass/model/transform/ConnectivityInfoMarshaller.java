/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.greengrass.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrass.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectivityInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectivityInfoMarshaller {

    private static final MarshallingInfo<String> HOSTADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HostAddress").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> METADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Metadata").build();
    private static final MarshallingInfo<Integer> PORTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PortNumber").build();

    private static final ConnectivityInfoMarshaller instance = new ConnectivityInfoMarshaller();

    public static ConnectivityInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectivityInfo connectivityInfo, ProtocolMarshaller protocolMarshaller) {

        if (connectivityInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectivityInfo.getHostAddress(), HOSTADDRESS_BINDING);
            protocolMarshaller.marshall(connectivityInfo.getId(), ID_BINDING);
            protocolMarshaller.marshall(connectivityInfo.getMetadata(), METADATA_BINDING);
            protocolMarshaller.marshall(connectivityInfo.getPortNumber(), PORTNUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
