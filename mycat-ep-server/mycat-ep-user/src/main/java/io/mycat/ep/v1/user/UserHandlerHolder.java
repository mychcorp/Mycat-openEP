// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.0
//
// <auto-generated>
//
// Generated from file `User.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package io.mycat.ep.v1.user;

public final class UserHandlerHolder extends Ice.ObjectHolderBase<UserHandler>
{
    public
    UserHandlerHolder()
    {
    }

    public
    UserHandlerHolder(UserHandler value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof UserHandler)
        {
            value = (UserHandler)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _UserHandlerDisp.ice_staticId();
    }
}
