package com.institutopacifico.actualidad.modules.treesfoldersandfiles.magazine.adapters.tree.bean


import com.institutopacifico.actualidad.R
import com.institutopacifico.actualidad.objects.RichFolderAndArticleObject

import tellh.com.recyclertreeview_lib.LayoutItemType

/**
 * Created by tlh on 2016/10/1 :)
 */

class File(var currentObject: RichFolderAndArticleObject) : LayoutItemType {
    val fileName: String = currentObject.string_object_name_or_title



    override fun getLayoutId(): Int {
        return R.layout.treeview_file
    }
}