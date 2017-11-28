/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.dynamic.data.mapping.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.dynamic.data.mapping.model.DDMFormInstance;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DDMFormInstance in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DDMFormInstance
 * @generated
 */
@ProviderType
public class DDMFormInstanceCacheModel implements CacheModel<DDMFormInstance>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DDMFormInstanceCacheModel)) {
			return false;
		}

		DDMFormInstanceCacheModel ddmFormInstanceCacheModel = (DDMFormInstanceCacheModel)obj;

		if (formInstanceId == ddmFormInstanceCacheModel.formInstanceId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, formInstanceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", formInstanceId=");
		sb.append(formInstanceId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", versionUserId=");
		sb.append(versionUserId);
		sb.append(", versionUserName=");
		sb.append(versionUserName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", structureId=");
		sb.append(structureId);
		sb.append(", version=");
		sb.append(version);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", settings=");
		sb.append(settings);
		sb.append(", lastPublishDate=");
		sb.append(lastPublishDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DDMFormInstance toEntityModel() {
		DDMFormInstanceImpl ddmFormInstanceImpl = new DDMFormInstanceImpl();

		if (uuid == null) {
			ddmFormInstanceImpl.setUuid(StringPool.BLANK);
		}
		else {
			ddmFormInstanceImpl.setUuid(uuid);
		}

		ddmFormInstanceImpl.setFormInstanceId(formInstanceId);
		ddmFormInstanceImpl.setGroupId(groupId);
		ddmFormInstanceImpl.setCompanyId(companyId);
		ddmFormInstanceImpl.setUserId(userId);

		if (userName == null) {
			ddmFormInstanceImpl.setUserName(StringPool.BLANK);
		}
		else {
			ddmFormInstanceImpl.setUserName(userName);
		}

		ddmFormInstanceImpl.setVersionUserId(versionUserId);

		if (versionUserName == null) {
			ddmFormInstanceImpl.setVersionUserName(StringPool.BLANK);
		}
		else {
			ddmFormInstanceImpl.setVersionUserName(versionUserName);
		}

		if (createDate == Long.MIN_VALUE) {
			ddmFormInstanceImpl.setCreateDate(null);
		}
		else {
			ddmFormInstanceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ddmFormInstanceImpl.setModifiedDate(null);
		}
		else {
			ddmFormInstanceImpl.setModifiedDate(new Date(modifiedDate));
		}

		ddmFormInstanceImpl.setStructureId(structureId);

		if (version == null) {
			ddmFormInstanceImpl.setVersion(StringPool.BLANK);
		}
		else {
			ddmFormInstanceImpl.setVersion(version);
		}

		if (name == null) {
			ddmFormInstanceImpl.setName(StringPool.BLANK);
		}
		else {
			ddmFormInstanceImpl.setName(name);
		}

		if (description == null) {
			ddmFormInstanceImpl.setDescription(StringPool.BLANK);
		}
		else {
			ddmFormInstanceImpl.setDescription(description);
		}

		if (settings == null) {
			ddmFormInstanceImpl.setSettings(StringPool.BLANK);
		}
		else {
			ddmFormInstanceImpl.setSettings(settings);
		}

		if (lastPublishDate == Long.MIN_VALUE) {
			ddmFormInstanceImpl.setLastPublishDate(null);
		}
		else {
			ddmFormInstanceImpl.setLastPublishDate(new Date(lastPublishDate));
		}

		ddmFormInstanceImpl.resetOriginalValues();

		ddmFormInstanceImpl.setDDMFormValues(_ddmFormValues);

		return ddmFormInstanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput)
		throws ClassNotFoundException, IOException {
		uuid = objectInput.readUTF();

		formInstanceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();

		versionUserId = objectInput.readLong();
		versionUserName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		structureId = objectInput.readLong();
		version = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		settings = objectInput.readUTF();
		lastPublishDate = objectInput.readLong();

		_ddmFormValues = (com.liferay.dynamic.data.mapping.storage.DDMFormValues)objectInput.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(formInstanceId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(versionUserId);

		if (versionUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(versionUserName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(structureId);

		if (version == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(version);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (settings == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(settings);
		}

		objectOutput.writeLong(lastPublishDate);

		objectOutput.writeObject(_ddmFormValues);
	}

	public String uuid;
	public long formInstanceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long versionUserId;
	public String versionUserName;
	public long createDate;
	public long modifiedDate;
	public long structureId;
	public String version;
	public String name;
	public String description;
	public String settings;
	public long lastPublishDate;
	public com.liferay.dynamic.data.mapping.storage.DDMFormValues _ddmFormValues;
}