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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the DescribeHostedConnections operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeHostedConnections"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHostedConnectionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the interconnect or LAG on which the hosted connections are provisioned.
     * </p>
     * <p>
     * Example: dxcon-abc123 or dxlag-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The ID of the interconnect or LAG on which the hosted connections are provisioned.
     * </p>
     * <p>
     * Example: dxcon-abc123 or dxlag-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param connectionId
     *        The ID of the interconnect or LAG on which the hosted connections are provisioned.</p>
     *        <p>
     *        Example: dxcon-abc123 or dxlag-abc123
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the interconnect or LAG on which the hosted connections are provisioned.
     * </p>
     * <p>
     * Example: dxcon-abc123 or dxlag-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The ID of the interconnect or LAG on which the hosted connections are provisioned.</p>
     *         <p>
     *         Example: dxcon-abc123 or dxlag-abc123
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the interconnect or LAG on which the hosted connections are provisioned.
     * </p>
     * <p>
     * Example: dxcon-abc123 or dxlag-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param connectionId
     *        The ID of the interconnect or LAG on which the hosted connections are provisioned.</p>
     *        <p>
     *        Example: dxcon-abc123 or dxlag-abc123
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostedConnectionsRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHostedConnectionsRequest == false)
            return false;
        DescribeHostedConnectionsRequest other = (DescribeHostedConnectionsRequest) obj;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHostedConnectionsRequest clone() {
        return (DescribeHostedConnectionsRequest) super.clone();
    }

}
