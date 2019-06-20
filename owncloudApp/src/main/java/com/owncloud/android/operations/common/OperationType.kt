package com.owncloud.android.operations.common

enum class OperationType {
    CREATE_PUBLIC_SHARE,
    CREATE_SHARE_WITH_SHAREES,
    UPDATE_PUBLIC_SHARE,
    REMOVE_SHARE,
    UPDATE_SHARE_PERMISSIONS,
    GET_SHARES,
    UPLOAD_FILE,
    DOWNLOAD_FILE,
    REMOVE_FILE,
    RENAME_FILE,
    CREATE_FOLDER,
    MOVE_FILE,
    COPY_FILE,
    SYNCHRONIZE_FOLDER,
    GET_CAPABILITIES
}