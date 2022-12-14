package com.kefu.netty.serialize.impl;

import com.alibaba.fastjson.JSON;
import com.kefu.netty.serialize.Serializer;
import com.kefu.netty.serialize.SerializerAlgorithm;

/**
 * json εΊεεε¨
 *
 * @author feng
 * @date 2019-04-20
 */
public class JSONSerializer implements Serializer {

    @Override
    public byte getSerializerAlgorithm() {
        return SerializerAlgorithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {
        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }
}
