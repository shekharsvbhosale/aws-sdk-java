/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Segment definition.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/WriteSegmentRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WriteSegmentRequest implements Serializable, Cloneable, StructuredPojo {

    /** The segment dimensions attributes. */
    private SegmentDimensions dimensions;
    /** The name of segment */
    private String name;
    /** Segment definition groups. We currently only support one. If specified Dimensions must be empty. */
    private SegmentGroupList segmentGroups;

    /**
     * The segment dimensions attributes.
     * 
     * @param dimensions
     *        The segment dimensions attributes.
     */

    public void setDimensions(SegmentDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * The segment dimensions attributes.
     * 
     * @return The segment dimensions attributes.
     */

    public SegmentDimensions getDimensions() {
        return this.dimensions;
    }

    /**
     * The segment dimensions attributes.
     * 
     * @param dimensions
     *        The segment dimensions attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteSegmentRequest withDimensions(SegmentDimensions dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * The name of segment
     * 
     * @param name
     *        The name of segment
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of segment
     * 
     * @return The name of segment
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of segment
     * 
     * @param name
     *        The name of segment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteSegmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Segment definition groups. We currently only support one. If specified Dimensions must be empty.
     * 
     * @param segmentGroups
     *        Segment definition groups. We currently only support one. If specified Dimensions must be empty.
     */

    public void setSegmentGroups(SegmentGroupList segmentGroups) {
        this.segmentGroups = segmentGroups;
    }

    /**
     * Segment definition groups. We currently only support one. If specified Dimensions must be empty.
     * 
     * @return Segment definition groups. We currently only support one. If specified Dimensions must be empty.
     */

    public SegmentGroupList getSegmentGroups() {
        return this.segmentGroups;
    }

    /**
     * Segment definition groups. We currently only support one. If specified Dimensions must be empty.
     * 
     * @param segmentGroups
     *        Segment definition groups. We currently only support one. If specified Dimensions must be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteSegmentRequest withSegmentGroups(SegmentGroupList segmentGroups) {
        setSegmentGroups(segmentGroups);
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
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSegmentGroups() != null)
            sb.append("SegmentGroups: ").append(getSegmentGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteSegmentRequest == false)
            return false;
        WriteSegmentRequest other = (WriteSegmentRequest) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSegmentGroups() == null ^ this.getSegmentGroups() == null)
            return false;
        if (other.getSegmentGroups() != null && other.getSegmentGroups().equals(this.getSegmentGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSegmentGroups() == null) ? 0 : getSegmentGroups().hashCode());
        return hashCode;
    }

    @Override
    public WriteSegmentRequest clone() {
        try {
            return (WriteSegmentRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.WriteSegmentRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
