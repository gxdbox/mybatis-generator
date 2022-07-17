package com.baiguo.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "product")
public class ProductDO {
    @Id
    private Integer id;

    /**
     * 商品编号
     */
    @Column(name = "goods_sn")
    private String goodsSn;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品所属类目id
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 商品宣传图片列表，采用JSON数组格式
     */
    private String gallery;

    /**
     * 商品关键字，采用逗号隔开
     */
    private String keywords;

    /**
     * 商品简介
     */
    private String brief;

    /**
     * 商品页面商品图片
     */
    @Column(name = "pic_url")
    private String picUrl;

    /**
     * 商品分享朋友圈图片
     */
    @Column(name = "share_url")
    private String shareUrl;

    /**
     * 商品原价
     */
    @Column(name = "original_price")
    private BigDecimal originalPrice;

    /**
     * 一口价
     */
    @Column(name = "buy_price")
    private BigDecimal buyPrice;

    /**
     * 商品详细接受，是富文本格式
     */
    private String detail;

    /**
     * 创建时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否删除（属于逻辑删除）
     */
    private Integer deleted;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品编号
     *
     * @return goods_sn - 商品编号
     */
    public String getGoodsSn() {
        return goodsSn;
    }

    /**
     * 设置商品编号
     *
     * @param goodsSn 商品编号
     */
    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    /**
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商品所属类目id
     *
     * @return category_id - 商品所属类目id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置商品所属类目id
     *
     * @param categoryId 商品所属类目id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取商品宣传图片列表，采用JSON数组格式
     *
     * @return gallery - 商品宣传图片列表，采用JSON数组格式
     */
    public String getGallery() {
        return gallery;
    }

    /**
     * 设置商品宣传图片列表，采用JSON数组格式
     *
     * @param gallery 商品宣传图片列表，采用JSON数组格式
     */
    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    /**
     * 获取商品关键字，采用逗号隔开
     *
     * @return keywords - 商品关键字，采用逗号隔开
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 设置商品关键字，采用逗号隔开
     *
     * @param keywords 商品关键字，采用逗号隔开
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * 获取商品简介
     *
     * @return brief - 商品简介
     */
    public String getBrief() {
        return brief;
    }

    /**
     * 设置商品简介
     *
     * @param brief 商品简介
     */
    public void setBrief(String brief) {
        this.brief = brief;
    }

    /**
     * 获取商品页面商品图片
     *
     * @return pic_url - 商品页面商品图片
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置商品页面商品图片
     *
     * @param picUrl 商品页面商品图片
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * 获取商品分享朋友圈图片
     *
     * @return share_url - 商品分享朋友圈图片
     */
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     * 设置商品分享朋友圈图片
     *
     * @param shareUrl 商品分享朋友圈图片
     */
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    /**
     * 获取商品原价
     *
     * @return original_price - 商品原价
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 设置商品原价
     *
     * @param originalPrice 商品原价
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * 获取一口价
     *
     * @return buy_price - 一口价
     */
    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    /**
     * 设置一口价
     *
     * @param buyPrice 一口价
     */
    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    /**
     * 获取商品详细接受，是富文本格式
     *
     * @return detail - 商品详细接受，是富文本格式
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置商品详细接受，是富文本格式
     *
     * @param detail 商品详细接受，是富文本格式
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 获取创建时间
     *
     * @return add_time - 创建时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置创建时间
     *
     * @param addTime 创建时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除（属于逻辑删除）
     *
     * @return deleted - 是否删除（属于逻辑删除）
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除（属于逻辑删除）
     *
     * @param deleted 是否删除（属于逻辑删除）
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}