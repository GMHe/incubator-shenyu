/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.admin.transfer;

import org.apache.shenyu.admin.model.dto.MetaDataDTO;
import org.apache.shenyu.admin.model.entity.MetaDataDO;
import org.apache.shenyu.admin.model.vo.MetaDataVO;
import org.apache.shenyu.common.dto.MetaData;
import org.apache.shenyu.common.utils.DateUtils;
import org.apache.shenyu.register.common.dto.MetaDataRegisterDTO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * The interface Meta data transfer.
 */
public enum MetaDataTransfer {

    /**
     * The constant INSTANCE.
     */
    INSTANCE;

    /**
     * Map to entity meta data do.
     *
     * @param metaDataDTO the meta data dto
     * @return the meta data do
     */
    public MetaDataDO mapToEntity(final MetaDataDTO metaDataDTO) {
        return Optional.ofNullable(metaDataDTO)
                .map(v -> {
                    MetaDataDO.MetaDataDOBuilder metaDataDO = MetaDataDO.builder();
                    metaDataDO.id(v.getId());
                    metaDataDO.appName(v.getAppName());
                    metaDataDO.path(v.getPath());
                    metaDataDO.pathDesc(v.getPathDesc());
                    metaDataDO.rpcType(v.getRpcType());
                    metaDataDO.serviceName(v.getServiceName());
                    metaDataDO.methodName(v.getMethodName());
                    metaDataDO.parameterTypes(v.getParameterTypes());
                    metaDataDO.rpcExt(v.getRpcExt());
                    metaDataDO.enabled(v.getEnabled());

                    return metaDataDO.build();
                })
                .orElse(null);
    }

    /**
     * Map to entity meta data do.
     *
     * @param metaDataDTO the meta data dto
     * @return the meta data do
     */
    public MetaDataDO mapRegisterDTOToEntity(final MetaDataRegisterDTO metaDataDTO) {
        return Optional.ofNullable(metaDataDTO)
                .map(v -> {
                    MetaDataDO.MetaDataDOBuilder metaDataDO = MetaDataDO.builder();
                    metaDataDO.appName(v.getAppName());
                    metaDataDO.path(v.getPath());
                    metaDataDO.pathDesc(v.getPathDesc());
                    metaDataDO.rpcType(v.getRpcType());
                    metaDataDO.serviceName(v.getServiceName());
                    metaDataDO.methodName(v.getMethodName());
                    metaDataDO.parameterTypes(v.getParameterTypes());
                    metaDataDO.rpcExt(v.getRpcExt());
                    metaDataDO.enabled(v.isEnabled());

                    return metaDataDO.build();
                })
                .orElse(null);
    }

    /**
     * Map to data meta data.
     *
     * @param metaDataDTO the meta data dto
     * @return the meta data
     */
    public MetaData mapToData(final MetaDataDTO metaDataDTO) {
        return Optional.ofNullable(metaDataDTO)
                .map(v -> {
                    MetaData.Builder metaData = MetaData.builder();
                    metaData.id(v.getId());
                    metaData.appName(v.getAppName());
                    metaData.contextPath(v.getContextPath());
                    metaData.path(v.getPath());
                    metaData.rpcType(v.getRpcType());
                    metaData.serviceName(v.getServiceName());
                    metaData.methodName(v.getMethodName());
                    metaData.parameterTypes(v.getParameterTypes());
                    metaData.rpcExt(v.getRpcExt());
                    metaData.enabled(v.getEnabled());

                    return metaData.build();
                })
                .orElse(null);
    }

    /**
     * Map to data meta data.
     *
     * @param metaDataDO the meta data dto
     * @return the meta data
     */
    public MetaData mapToData(final MetaDataDO metaDataDO) {
        return Optional.ofNullable(metaDataDO)
                .map(v -> {
                    MetaData.Builder metaData = MetaData.builder();
                    metaData.id(v.getId());
                    metaData.appName(v.getAppName());
                    metaData.path(v.getPath());
                    metaData.rpcType(v.getRpcType());
                    metaData.serviceName(v.getServiceName());
                    metaData.methodName(v.getMethodName());
                    metaData.parameterTypes(v.getParameterTypes());
                    metaData.rpcExt(v.getRpcExt());
                    metaData.enabled(v.getEnabled());

                    return metaData.build();
                })
                .orElse(null);
    }

    /**
     * Map to data all list.
     *
     * @param metaDataDOList the meta data do list
     * @return the list
     */
    public List<MetaData> mapToDataAll(final List<MetaDataDO> metaDataDOList) {
        return Optional.ofNullable(metaDataDOList)
                .map(v -> v.stream().map(this::mapToData).collect(Collectors.toList()))
                .orElse(null);
    }

    /**
     * Map to vo meta data vo.
     *
     * @param metaDataDO the meta data do
     * @return the meta data vo
     */
    public MetaDataVO mapToVO(final MetaDataDO metaDataDO) {
        return Optional.ofNullable(metaDataDO)
                .map(v -> {
                    MetaDataVO metaDataVO = new MetaDataVO();
                    metaDataVO.setAppName(metaDataDO.getAppName());
                    metaDataVO.setPath(metaDataDO.getPath());
                    metaDataVO.setPathDesc(metaDataDO.getPathDesc());
                    metaDataVO.setRpcType(metaDataDO.getRpcType());
                    metaDataVO.setServiceName(metaDataDO.getServiceName());
                    metaDataVO.setMethodName(metaDataDO.getMethodName());
                    metaDataVO.setParameterTypes(metaDataDO.getParameterTypes());
                    metaDataVO.setRpcExt(metaDataDO.getRpcExt());
                    metaDataVO.setId(metaDataDO.getId());
                    metaDataVO.setEnabled(metaDataDO.getEnabled());
                    metaDataVO.setDateCreated(Optional.ofNullable(metaDataDO.getDateCreated())
                            .map(u -> DateUtils.localDateTimeToString(u.toLocalDateTime())).orElse(null));
                    metaDataVO.setDateUpdated(Optional.ofNullable(metaDataDO.getDateUpdated())
                            .map(u -> DateUtils.localDateTimeToString(u.toLocalDateTime())).orElse(null));

                    return metaDataVO;
                })
                .orElse(null);
    }

    /**
     * Map to vo list list.
     *
     * @param metaDataDOList the meta data do list
     * @return the list
     */
    public List<MetaDataVO> mapToVOList(final List<MetaDataDO> metaDataDOList) {
        return Optional.ofNullable(metaDataDOList)
                .map(v -> v.stream().map(this::mapToVO).collect(Collectors.toList()))
                .orElse(null);
    }

}
