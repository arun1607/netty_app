package com.learning.beans;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * Created by amitshrivastava on 27/10/16.
 */
public class TimeStampEncoder extends MessageToByteEncoder<LoopBackTimeStamp> {
    @Override
    protected void encode(ChannelHandlerContext ctx, LoopBackTimeStamp msg, ByteBuf out) throws Exception {
        out.writeBytes(msg.toByteArray());
    }
}
