
package io.fabric8.openshift.api.model.monitoring.v1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attachMetadata",
    "endpoints",
    "jobLabel",
    "keepDroppedTargets",
    "labelLimit",
    "labelNameLengthLimit",
    "labelValueLengthLimit",
    "namespaceSelector",
    "podTargetLabels",
    "sampleLimit",
    "selector",
    "targetLabels",
    "targetLimit"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class ServiceMonitorSpec implements Editable<ServiceMonitorSpecBuilder> , KubernetesResource
{

    @JsonProperty("attachMetadata")
    private AttachMetadata attachMetadata;
    @JsonProperty("endpoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Endpoint> endpoints = new ArrayList<Endpoint>();
    @JsonProperty("jobLabel")
    private String jobLabel;
    @JsonProperty("keepDroppedTargets")
    private Long keepDroppedTargets;
    @JsonProperty("labelLimit")
    private Long labelLimit;
    @JsonProperty("labelNameLengthLimit")
    private Long labelNameLengthLimit;
    @JsonProperty("labelValueLengthLimit")
    private Long labelValueLengthLimit;
    @JsonProperty("namespaceSelector")
    private NamespaceSelector namespaceSelector;
    @JsonProperty("podTargetLabels")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> podTargetLabels = new ArrayList<String>();
    @JsonProperty("sampleLimit")
    private Long sampleLimit;
    @JsonProperty("selector")
    private io.fabric8.kubernetes.api.model.LabelSelector selector;
    @JsonProperty("targetLabels")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> targetLabels = new ArrayList<String>();
    @JsonProperty("targetLimit")
    private Long targetLimit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ServiceMonitorSpec() {
    }

    public ServiceMonitorSpec(AttachMetadata attachMetadata, List<Endpoint> endpoints, String jobLabel, Long keepDroppedTargets, Long labelLimit, Long labelNameLengthLimit, Long labelValueLengthLimit, NamespaceSelector namespaceSelector, List<String> podTargetLabels, Long sampleLimit, io.fabric8.kubernetes.api.model.LabelSelector selector, List<String> targetLabels, Long targetLimit) {
        super();
        this.attachMetadata = attachMetadata;
        this.endpoints = endpoints;
        this.jobLabel = jobLabel;
        this.keepDroppedTargets = keepDroppedTargets;
        this.labelLimit = labelLimit;
        this.labelNameLengthLimit = labelNameLengthLimit;
        this.labelValueLengthLimit = labelValueLengthLimit;
        this.namespaceSelector = namespaceSelector;
        this.podTargetLabels = podTargetLabels;
        this.sampleLimit = sampleLimit;
        this.selector = selector;
        this.targetLabels = targetLabels;
        this.targetLimit = targetLimit;
    }

    @JsonProperty("attachMetadata")
    public AttachMetadata getAttachMetadata() {
        return attachMetadata;
    }

    @JsonProperty("attachMetadata")
    public void setAttachMetadata(AttachMetadata attachMetadata) {
        this.attachMetadata = attachMetadata;
    }

    @JsonProperty("endpoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<Endpoint> getEndpoints() {
        return endpoints;
    }

    @JsonProperty("endpoints")
    public void setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
    }

    @JsonProperty("jobLabel")
    public String getJobLabel() {
        return jobLabel;
    }

    @JsonProperty("jobLabel")
    public void setJobLabel(String jobLabel) {
        this.jobLabel = jobLabel;
    }

    @JsonProperty("keepDroppedTargets")
    public Long getKeepDroppedTargets() {
        return keepDroppedTargets;
    }

    @JsonProperty("keepDroppedTargets")
    public void setKeepDroppedTargets(Long keepDroppedTargets) {
        this.keepDroppedTargets = keepDroppedTargets;
    }

    @JsonProperty("labelLimit")
    public Long getLabelLimit() {
        return labelLimit;
    }

    @JsonProperty("labelLimit")
    public void setLabelLimit(Long labelLimit) {
        this.labelLimit = labelLimit;
    }

    @JsonProperty("labelNameLengthLimit")
    public Long getLabelNameLengthLimit() {
        return labelNameLengthLimit;
    }

    @JsonProperty("labelNameLengthLimit")
    public void setLabelNameLengthLimit(Long labelNameLengthLimit) {
        this.labelNameLengthLimit = labelNameLengthLimit;
    }

    @JsonProperty("labelValueLengthLimit")
    public Long getLabelValueLengthLimit() {
        return labelValueLengthLimit;
    }

    @JsonProperty("labelValueLengthLimit")
    public void setLabelValueLengthLimit(Long labelValueLengthLimit) {
        this.labelValueLengthLimit = labelValueLengthLimit;
    }

    @JsonProperty("namespaceSelector")
    public NamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    @JsonProperty("namespaceSelector")
    public void setNamespaceSelector(NamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    @JsonProperty("podTargetLabels")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getPodTargetLabels() {
        return podTargetLabels;
    }

    @JsonProperty("podTargetLabels")
    public void setPodTargetLabels(List<String> podTargetLabels) {
        this.podTargetLabels = podTargetLabels;
    }

    @JsonProperty("sampleLimit")
    public Long getSampleLimit() {
        return sampleLimit;
    }

    @JsonProperty("sampleLimit")
    public void setSampleLimit(Long sampleLimit) {
        this.sampleLimit = sampleLimit;
    }

    @JsonProperty("selector")
    public io.fabric8.kubernetes.api.model.LabelSelector getSelector() {
        return selector;
    }

    @JsonProperty("selector")
    public void setSelector(io.fabric8.kubernetes.api.model.LabelSelector selector) {
        this.selector = selector;
    }

    @JsonProperty("targetLabels")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getTargetLabels() {
        return targetLabels;
    }

    @JsonProperty("targetLabels")
    public void setTargetLabels(List<String> targetLabels) {
        this.targetLabels = targetLabels;
    }

    @JsonProperty("targetLimit")
    public Long getTargetLimit() {
        return targetLimit;
    }

    @JsonProperty("targetLimit")
    public void setTargetLimit(Long targetLimit) {
        this.targetLimit = targetLimit;
    }

    @JsonIgnore
    public ServiceMonitorSpecBuilder edit() {
        return new ServiceMonitorSpecBuilder(this);
    }

    @JsonIgnore
    public ServiceMonitorSpecBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
