/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a CreateApplication operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application. This name must be unique with the applicable IAM user or AWS account.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The destination platform type for the deployment <code>Lambda</code> or <code>Server</code>).
     * </p>
     */
    private String computePlatform;

    /**
     * <p>
     * The name of the application. This name must be unique with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of the application. This name must be unique with the applicable IAM user or AWS account.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application. This name must be unique with the applicable IAM user or AWS account.
     * </p>
     * 
     * @return The name of the application. This name must be unique with the applicable IAM user or AWS account.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application. This name must be unique with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of the application. This name must be unique with the applicable IAM user or AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The destination platform type for the deployment <code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for the deployment <code>Lambda</code> or <code>Server</code>).
     * @see ComputePlatform
     */

    public void setComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
    }

    /**
     * <p>
     * The destination platform type for the deployment <code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @return The destination platform type for the deployment <code>Lambda</code> or <code>Server</code>).
     * @see ComputePlatform
     */

    public String getComputePlatform() {
        return this.computePlatform;
    }

    /**
     * <p>
     * The destination platform type for the deployment <code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for the deployment <code>Lambda</code> or <code>Server</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputePlatform
     */

    public CreateApplicationRequest withComputePlatform(String computePlatform) {
        setComputePlatform(computePlatform);
        return this;
    }

    /**
     * <p>
     * The destination platform type for the deployment <code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for the deployment <code>Lambda</code> or <code>Server</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputePlatform
     */

    public CreateApplicationRequest withComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getComputePlatform() != null)
            sb.append("ComputePlatform: ").append(getComputePlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getComputePlatform() == null ^ this.getComputePlatform() == null)
            return false;
        if (other.getComputePlatform() != null && other.getComputePlatform().equals(this.getComputePlatform()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getComputePlatform() == null) ? 0 : getComputePlatform().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }

}
