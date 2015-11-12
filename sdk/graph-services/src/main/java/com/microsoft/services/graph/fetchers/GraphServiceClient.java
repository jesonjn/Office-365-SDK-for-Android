
/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/

package com.microsoft.services.graph.fetchers;

import com.microsoft.services.graph.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.DependencyResolver;

/**
 * The type GraphServiceClient.
 */
public class GraphServiceClient extends BaseOrcContainer {

     /**
     * Instantiates a new GraphServiceClient.
     *
     * @param url the url
     * @param resolver the resolver
     */
    public GraphServiceClient(String url, DependencyResolver resolver) {
        super(url, resolver);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public GraphServiceClient addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public GraphServiceClient addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

     /**
     * Gets DirectoryObject.
     *
     * @return the DirectoryObject
     */
    public OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getDirectoryObjects() {
        return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("directoryObjects", this, DirectoryObject.class,DirectoryObjectCollectionOperations.class);
    }
     /**
     * Gets Application.
     *
     * @return the Application
     */
    public OrcCollectionFetcher<Application, ApplicationFetcher, ApplicationCollectionOperations> getApplications() {
        return new OrcCollectionFetcher<Application, ApplicationFetcher, ApplicationCollectionOperations>("applications", this, Application.class,ApplicationCollectionOperations.class);
    }
     /**
     * Gets OrgContact.
     *
     * @return the OrgContact
     */
    public OrcCollectionFetcher<OrgContact, OrgContactFetcher, OrgContactCollectionOperations> getContacts() {
        return new OrcCollectionFetcher<OrgContact, OrgContactFetcher, OrgContactCollectionOperations>("contacts", this, OrgContact.class,OrgContactCollectionOperations.class);
    }
     /**
     * Gets DeviceConfiguration.
     *
     * @return the DeviceConfiguration
     */
    public OrcCollectionFetcher<DeviceConfiguration, DeviceConfigurationFetcher, DeviceConfigurationCollectionOperations> getDeviceConfiguration() {
        return new OrcCollectionFetcher<DeviceConfiguration, DeviceConfigurationFetcher, DeviceConfigurationCollectionOperations>("deviceConfiguration", this, DeviceConfiguration.class,DeviceConfigurationCollectionOperations.class);
    }
     /**
     * Gets Device.
     *
     * @return the Device
     */
    public OrcCollectionFetcher<Device, DeviceFetcher, DeviceCollectionOperations> getDevices() {
        return new OrcCollectionFetcher<Device, DeviceFetcher, DeviceCollectionOperations>("devices", this, Device.class,DeviceCollectionOperations.class);
    }
     /**
     * Gets Group.
     *
     * @return the Group
     */
    public OrcCollectionFetcher<Group, GroupFetcher, GroupCollectionOperations> getGroups() {
        return new OrcCollectionFetcher<Group, GroupFetcher, GroupCollectionOperations>("groups", this, Group.class,GroupCollectionOperations.class);
    }
     /**
     * Gets DirectoryRole.
     *
     * @return the DirectoryRole
     */
    public OrcCollectionFetcher<DirectoryRole, DirectoryRoleFetcher, DirectoryRoleCollectionOperations> getDirectoryRoles() {
        return new OrcCollectionFetcher<DirectoryRole, DirectoryRoleFetcher, DirectoryRoleCollectionOperations>("directoryRoles", this, DirectoryRole.class,DirectoryRoleCollectionOperations.class);
    }
     /**
     * Gets DirectoryRoleTemplate.
     *
     * @return the DirectoryRoleTemplate
     */
    public OrcCollectionFetcher<DirectoryRoleTemplate, DirectoryRoleTemplateFetcher, DirectoryRoleTemplateCollectionOperations> getDirectoryRoleTemplates() {
        return new OrcCollectionFetcher<DirectoryRoleTemplate, DirectoryRoleTemplateFetcher, DirectoryRoleTemplateCollectionOperations>("directoryRoleTemplates", this, DirectoryRoleTemplate.class,DirectoryRoleTemplateCollectionOperations.class);
    }
     /**
     * Gets ServicePrincipal.
     *
     * @return the ServicePrincipal
     */
    public OrcCollectionFetcher<ServicePrincipal, ServicePrincipalFetcher, ServicePrincipalCollectionOperations> getServicePrincipals() {
        return new OrcCollectionFetcher<ServicePrincipal, ServicePrincipalFetcher, ServicePrincipalCollectionOperations>("servicePrincipals", this, ServicePrincipal.class,ServicePrincipalCollectionOperations.class);
    }
     /**
     * Gets TenantDetail.
     *
     * @return the TenantDetail
     */
    public OrcCollectionFetcher<TenantDetail, TenantDetailFetcher, TenantDetailCollectionOperations> getTenantDetails() {
        return new OrcCollectionFetcher<TenantDetail, TenantDetailFetcher, TenantDetailCollectionOperations>("tenantDetails", this, TenantDetail.class,TenantDetailCollectionOperations.class);
    }
     /**
     * Gets User.
     *
     * @return the User
     */
    public OrcCollectionFetcher<User, UserFetcher, UserCollectionOperations> getUsers() {
        return new OrcCollectionFetcher<User, UserFetcher, UserCollectionOperations>("users", this, User.class,UserCollectionOperations.class);
    }
     /**
     * Gets OAuth2PermissionGrant.
     *
     * @return the OAuth2PermissionGrant
     */
    public OrcCollectionFetcher<OAuth2PermissionGrant, OAuth2PermissionGrantFetcher, OAuth2PermissionGrantCollectionOperations> getOauth2PermissionGrants() {
        return new OrcCollectionFetcher<OAuth2PermissionGrant, OAuth2PermissionGrantFetcher, OAuth2PermissionGrantCollectionOperations>("oauth2PermissionGrants", this, OAuth2PermissionGrant.class,OAuth2PermissionGrantCollectionOperations.class);
    }
     /**
     * Gets SubscribedSku.
     *
     * @return the SubscribedSku
     */
    public OrcCollectionFetcher<SubscribedSku, SubscribedSkuFetcher, SubscribedSkuCollectionOperations> getSubscribedSkus() {
        return new OrcCollectionFetcher<SubscribedSku, SubscribedSkuFetcher, SubscribedSkuCollectionOperations>("subscribedSkus", this, SubscribedSku.class,SubscribedSkuCollectionOperations.class);
    }
     /**
     * Gets Drive.
     *
     * @return the Drive
     */
    public OrcCollectionFetcher<Drive, DriveFetcher, DriveCollectionOperations> getDrives() {
        return new OrcCollectionFetcher<Drive, DriveFetcher, DriveCollectionOperations>("drives", this, Drive.class,DriveCollectionOperations.class);
    }
     /**
     * Gets Share.
     *
     * @return the Share
     */
    public OrcCollectionFetcher<Share, ShareFetcher, ShareCollectionOperations> getShares() {
        return new OrcCollectionFetcher<Share, ShareFetcher, ShareCollectionOperations>("shares", this, Share.class,ShareCollectionOperations.class);
    }
     /**
     * Gets Task.
     *
     * @return the Task
     */
    public OrcCollectionFetcher<Task, TaskFetcher, TaskCollectionOperations> getTasks() {
        return new OrcCollectionFetcher<Task, TaskFetcher, TaskCollectionOperations>("tasks", this, Task.class,TaskCollectionOperations.class);
    }
     /**
     * Gets Plan.
     *
     * @return the Plan
     */
    public OrcCollectionFetcher<Plan, PlanFetcher, PlanCollectionOperations> getPlans() {
        return new OrcCollectionFetcher<Plan, PlanFetcher, PlanCollectionOperations>("plans", this, Plan.class,PlanCollectionOperations.class);
    }
     /**
     * Gets Bucket.
     *
     * @return the Bucket
     */
    public OrcCollectionFetcher<Bucket, BucketFetcher, BucketCollectionOperations> getBuckets() {
        return new OrcCollectionFetcher<Bucket, BucketFetcher, BucketCollectionOperations>("buckets", this, Bucket.class,BucketCollectionOperations.class);
    }
     /**
     * Gets SiteCollection.
     *
     * @return the SiteCollection
     */
    public OrcCollectionFetcher<SiteCollection, SiteCollectionFetcher, SiteCollectionCollectionOperations> getSiteCollections() {
        return new OrcCollectionFetcher<SiteCollection, SiteCollectionFetcher, SiteCollectionCollectionOperations>("siteCollections", this, SiteCollection.class,SiteCollectionCollectionOperations.class);
    }
     /**
     * Gets PrivilegedRole.
     *
     * @return the PrivilegedRole
     */
    public OrcCollectionFetcher<PrivilegedRole, PrivilegedRoleFetcher, PrivilegedRoleCollectionOperations> getPrivilegedRoles() {
        return new OrcCollectionFetcher<PrivilegedRole, PrivilegedRoleFetcher, PrivilegedRoleCollectionOperations>("PrivilegedRoles", this, PrivilegedRole.class,PrivilegedRoleCollectionOperations.class);
    }
     /**
     * Gets PrivilegedSecurityAlert.
     *
     * @return the PrivilegedSecurityAlert
     */
    public OrcCollectionFetcher<PrivilegedSecurityAlert, PrivilegedSecurityAlertFetcher, PrivilegedSecurityAlertCollectionOperations> getPrivilegedSecurityAlerts() {
        return new OrcCollectionFetcher<PrivilegedSecurityAlert, PrivilegedSecurityAlertFetcher, PrivilegedSecurityAlertCollectionOperations>("PrivilegedSecurityAlerts", this, PrivilegedSecurityAlert.class,PrivilegedSecurityAlertCollectionOperations.class);
    }
     /**
     * Gets PrivilegedRoleAssignment.
     *
     * @return the PrivilegedRoleAssignment
     */
    public OrcCollectionFetcher<PrivilegedRoleAssignment, PrivilegedRoleAssignmentFetcher, PrivilegedRoleAssignmentCollectionOperations> getPrivilegedRoleAssignments() {
        return new OrcCollectionFetcher<PrivilegedRoleAssignment, PrivilegedRoleAssignmentFetcher, PrivilegedRoleAssignmentCollectionOperations>("PrivilegedRoleAssignments", this, PrivilegedRoleAssignment.class,PrivilegedRoleAssignmentCollectionOperations.class);
    }
     /**
     * Gets PrivilegedOperationEvent.
     *
     * @return the PrivilegedOperationEvent
     */
    public OrcCollectionFetcher<PrivilegedOperationEvent, PrivilegedOperationEventFetcher, PrivilegedOperationEventCollectionOperations> getPrivilegedOperationEvents() {
        return new OrcCollectionFetcher<PrivilegedOperationEvent, PrivilegedOperationEventFetcher, PrivilegedOperationEventCollectionOperations>("PrivilegedOperationEvents", this, PrivilegedOperationEvent.class,PrivilegedOperationEventCollectionOperations.class);
    }
     /**
     * Gets PrivilegedSignupStatus.
     *
     * @return the PrivilegedSignupStatus
     */
    public OrcCollectionFetcher<PrivilegedSignupStatus, PrivilegedSignupStatusFetcher, PrivilegedSignupStatusCollectionOperations> getPrivilegedSignupStatus() {
        return new OrcCollectionFetcher<PrivilegedSignupStatus, PrivilegedSignupStatusFetcher, PrivilegedSignupStatusCollectionOperations>("PrivilegedSignupStatus", this, PrivilegedSignupStatus.class,PrivilegedSignupStatusCollectionOperations.class);
    }
     /**
     * Gets PrivilegedOperationNotification.
     *
     * @return the PrivilegedOperationNotification
     */
    public OrcCollectionFetcher<PrivilegedOperationNotification, PrivilegedOperationNotificationFetcher, PrivilegedOperationNotificationCollectionOperations> getPrivilegedOperationNotifications() {
        return new OrcCollectionFetcher<PrivilegedOperationNotification, PrivilegedOperationNotificationFetcher, PrivilegedOperationNotificationCollectionOperations>("PrivilegedOperationNotifications", this, PrivilegedOperationNotification.class,PrivilegedOperationNotificationCollectionOperations.class);
    }
     /**
     * Gets PrivilegedOperationNotificationRule.
     *
     * @return the PrivilegedOperationNotificationRule
     */
    public OrcCollectionFetcher<PrivilegedOperationNotificationRule, PrivilegedOperationNotificationRuleFetcher, PrivilegedOperationNotificationRuleCollectionOperations> getPrivilegedOperationNotificationRules() {
        return new OrcCollectionFetcher<PrivilegedOperationNotificationRule, PrivilegedOperationNotificationRuleFetcher, PrivilegedOperationNotificationRuleCollectionOperations>("PrivilegedOperationNotificationRules", this, PrivilegedOperationNotificationRule.class,PrivilegedOperationNotificationRuleCollectionOperations.class);
    }
     /**
     * Gets drive.
     *
     * @return the drive
     */
    public DriveFetcher getDrive() {
        return new DriveFetcher("drive", this);
    }
}