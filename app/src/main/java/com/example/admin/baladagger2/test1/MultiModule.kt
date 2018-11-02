package com.example.admin.baladagger2.test1

import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

/**
 * Created by zjw on 2018/10/9.
 */
@Module
class MultiModule {
    @Provides
    @ElementsIntoSet
    fun providerBananaSet(): Set<BananaBean> {
        var set = HashSet<BananaBean>()
        set.add(BananaBean("布什香蕉"))
        set.add(BananaBean("约翰逊香蕉"))
        return set
    }

    @Provides
    @IntoMap
    @StringKey("a")
    fun providerBananaMap(): BananaBean {
        return BananaBean("a apple")
    }

    @Provides
    @IntoMap
    @ClassKey(Person::class)
    fun providerClassMap(): BananaBean {
        return BananaBean("class apple")
    }

}