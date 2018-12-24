package mypackage;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "shop"
})
@XmlRootElement(name = "yml_catalog")
public class YmlCatalog {
  @XmlElement(required = true)
  protected YmlCatalog.Shop shop;
  @XmlAttribute(name = "date")
  protected String date;
  public YmlCatalog.Shop getShop() {
    return shop;
  }
  public void setShop(YmlCatalog.Shop value) {
    this.shop = value;
  }
  public String getDate() {
    return date;
  }
  public void setDate(String value) {
    this.date = value;
  }
  @ToString
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
          "name",
          "company",
          "url",
          "currencies",
          "categories",
          "offers"
  })
  public static class Shop {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String company;
    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected YmlCatalog.Shop.Currencies currencies;
    @XmlElement(required = true)
    protected YmlCatalog.Shop.Categories categories;
    @XmlElement(required = true)
    protected YmlCatalog.Shop.Offers offers;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
      return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
      this.name = value;
    }

    /**
     * Gets the value of the company property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCompany() {
      return company;
    }

    /**
     * Sets the value of the company property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCompany(String value) {
      this.company = value;
    }

    /**
     * Gets the value of the url property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUrl() {
      return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUrl(String value) {
      this.url = value;
    }

    /**
     * Gets the value of the currencies property.
     *
     * @return possible object is
     * {@link YmlCatalog.Shop.Currencies }
     */
    public YmlCatalog.Shop.Currencies getCurrencies() {
      return currencies;
    }

    /**
     * Sets the value of the currencies property.
     *
     * @param value allowed object is
     *              {@link YmlCatalog.Shop.Currencies }
     */
    public void setCurrencies(YmlCatalog.Shop.Currencies value) {
      this.currencies = value;
    }

    /**
     * Gets the value of the categories property.
     *
     * @return possible object is
     * {@link YmlCatalog.Shop.Categories }
     */
    public YmlCatalog.Shop.Categories getCategories() {
      return categories;
    }

    /**
     * Sets the value of the categories property.
     *
     * @param value allowed object is
     *              {@link YmlCatalog.Shop.Categories }
     */
    public void setCategories(YmlCatalog.Shop.Categories value) {
      this.categories = value;
    }

    /**
     * Gets the value of the offers property.
     *
     * @return possible object is
     * {@link YmlCatalog.Shop.Offers }
     */
    public YmlCatalog.Shop.Offers getOffers() {
      return offers;
    }

    /**
     * Sets the value of the offers property.
     *
     * @param value allowed object is
     *              {@link YmlCatalog.Shop.Offers }
     */
    public void setOffers(YmlCatalog.Shop.Offers value) {
      this.offers = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="category" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                 &lt;attribute name="parentId" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @ToString
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "category"
    })
    public static class Categories {

      protected List<YmlCatalog.Shop.Categories.Category> category;

      /**
       * Gets the value of the category property.
       *
       * <p>
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the category property.
       *
       * <p>
       * For example, to add a new item, do as follows:
       * <pre>
       *    getCategory().add(newItem);
       * </pre>
       *
       *
       * <p>
       * Objects of the following type(s) are allowed in the list
       * {@link YmlCatalog.Shop.Categories.Category }
       */
      public List<YmlCatalog.Shop.Categories.Category> getCategory() {
        if (category == null) {
          category = new ArrayList<YmlCatalog.Shop.Categories.Category>();
        }
        return this.category;
      }


      /**
       * <p>Java class for anonymous complex type.
       *
       * <p>The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;simpleContent>
       *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
       *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}short" />
       *       &lt;attribute name="parentId" type="{http://www.w3.org/2001/XMLSchema}short" />
       *     &lt;/extension>
       *   &lt;/simpleContent>
       * &lt;/complexType>
       * </pre>
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {
              "value"
      })
      public static class Category {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "id")
        protected Short id;
        @XmlAttribute(name = "parentId")
        protected Short parentId;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
          return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
          this.value = value;
        }

        /**
         * Gets the value of the id property.
         *
         * @return possible object is
         * {@link Short }
         */
        public Short getId() {
          return id;
        }

        /**
         * Sets the value of the id property.
         *
         * @param value allowed object is
         *              {@link Short }
         */
        public void setId(Short value) {
          this.id = value;
        }

        /**
         * Gets the value of the parentId property.
         *
         * @return possible object is
         * {@link Short }
         */
        public Short getParentId() {
          return parentId;
        }

        /**
         * Sets the value of the parentId property.
         *
         * @param value allowed object is
         *              {@link Short }
         */
        public void setParentId(Short value) {
          this.parentId = value;
        }

      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="currency">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="rate" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @ToString
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "currency"
    })
    public static class Currencies {

      @XmlElement(required = true)
      protected YmlCatalog.Shop.Currencies.Currency currency;

      /**
       * Gets the value of the currency property.
       *
       * @return possible object is
       * {@link YmlCatalog.Shop.Currencies.Currency }
       */
      public YmlCatalog.Shop.Currencies.Currency getCurrency() {
        return currency;
      }

      /**
       * Sets the value of the currency property.
       *
       * @param value allowed object is
       *              {@link YmlCatalog.Shop.Currencies.Currency }
       */
      public void setCurrency(YmlCatalog.Shop.Currencies.Currency value) {
        this.currency = value;
      }


      /**
       * <p>Java class for anonymous complex type.
       *
       * <p>The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;simpleContent>
       *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
       *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
       *       &lt;attribute name="rate" type="{http://www.w3.org/2001/XMLSchema}byte" />
       *     &lt;/extension>
       *   &lt;/simpleContent>
       * &lt;/complexType>
       * </pre>
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {
              "value"
      })
      public static class Currency {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "rate")
        protected Byte rate;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
          return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
          this.value = value;
        }

        /**
         * Gets the value of the id property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getId() {
          return id;
        }

        /**
         * Sets the value of the id property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setId(String value) {
          this.id = value;
        }

        /**
         * Gets the value of the rate property.
         *
         * @return possible object is
         * {@link Byte }
         */
        public Byte getRate() {
          return rate;
        }

        /**
         * Sets the value of the rate property.
         *
         * @param value allowed object is
         *              {@link Byte }
         */
        public void setRate(Byte value) {
          this.rate = value;
        }

      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="offer" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}short" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="modified_time" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="oldprice" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="param" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="picture" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="available" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @ToString
    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "offer"
    })
    public static class Offers {

      protected List<YmlCatalog.Shop.Offers.Offer> offer;

      /**
       * Gets the value of the offer property.
       *
       * <p>
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the offer property.
       *
       * <p>
       * For example, to add a new item, do as follows:
       * <pre>
       *    getOffer().add(newItem);
       * </pre>
       *
       *
       * <p>
       * Objects of the following type(s) are allowed in the list
       * {@link YmlCatalog.Shop.Offers.Offer }
       */
      public List<YmlCatalog.Shop.Offers.Offer> getOffer() {
        if (offer == null) {
          offer = new ArrayList<YmlCatalog.Shop.Offers.Offer>();
        }
        return this.offer;
      }


      /**
       * <p>Java class for anonymous complex type.
       *
       * <p>The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}short" maxOccurs="unbounded" minOccurs="0"/>
       *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="modified_time" type="{http://www.w3.org/2001/XMLSchema}int"/>
       *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="oldprice" type="{http://www.w3.org/2001/XMLSchema}float"/>
       *         &lt;element name="param" maxOccurs="unbounded" minOccurs="0">
       *           &lt;complexType>
       *             &lt;simpleContent>
       *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
       *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
       *               &lt;/extension>
       *             &lt;/simpleContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="picture" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
       *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
       *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *       &lt;attribute name="available" type="{http://www.w3.org/2001/XMLSchema}string" />
       *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {
              "categoryId",
              "currencyId",
              "description",
              "modifiedTime",
              "name",
              "oldprice",
              "param",
              "picture",
              "price",
              "url",
              "vendor"
      })
      public static class Offer {
        @XmlElement(type = Short.class)
        protected List<Short> categoryId;
        @XmlElement(required = true)
        protected String currencyId;
        @XmlElement(required = true)
        protected String description;
        @XmlElement(name = "modified_time")
        protected int modifiedTime;
        @XmlElement(required = true)
        protected String name;
        protected float oldprice;
        protected List<YmlCatalog.Shop.Offers.Offer.Param> param;
        protected List<String> picture;
        protected float price;
        @XmlElement(required = true)
        protected String url;
        @XmlElement(required = true)
        protected String vendor;
        @XmlAttribute(name = "available")
        protected String available;
        @XmlAttribute(name = "id")
        protected Integer id;

        /**
         * Gets the value of the categoryId property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the categoryId property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategoryId().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Short }
         */
        public List<Short> getCategoryId() {
          if (categoryId == null) {
            categoryId = new ArrayList<Short>();
          }
          return this.categoryId;
        }

        /**
         * Gets the value of the currencyId property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCurrencyId() {
          return currencyId;
        }

        /**
         * Sets the value of the currencyId property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCurrencyId(String value) {
          this.currencyId = value;
        }

        /**
         * Gets the value of the description property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getDescription() {
          return description;
        }

        /**
         * Sets the value of the description property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDescription(String value) {
          this.description = value;
        }

        /**
         * Gets the value of the modifiedTime property.
         */
        public int getModifiedTime() {
          return modifiedTime;
        }

        /**
         * Sets the value of the modifiedTime property.
         */
        public void setModifiedTime(int value) {
          this.modifiedTime = value;
        }

        /**
         * Gets the value of the name property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getName() {
          return name;
        }

        /**
         * Sets the value of the name property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setName(String value) {
          this.name = value;
        }

        /**
         * Gets the value of the oldprice property.
         */
        public float getOldprice() {
          return oldprice;
        }

        /**
         * Sets the value of the oldprice property.
         */
        public void setOldprice(float value) {
          this.oldprice = value;
        }

        /**
         * Gets the value of the param property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the param property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParam().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link YmlCatalog.Shop.Offers.Offer.Param }
         */
        public List<YmlCatalog.Shop.Offers.Offer.Param> getParam() {
          if (param == null) {
            param = new ArrayList<YmlCatalog.Shop.Offers.Offer.Param>();
          }
          return this.param;
        }

        /**
         * Gets the value of the picture property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the picture property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPicture().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPicture() {
          if (picture == null) {
            picture = new ArrayList<String>();
          }
          return this.picture;
        }

        /**
         * Gets the value of the price property.
         */
        public float getPrice() {
          return price;
        }

        /**
         * Sets the value of the price property.
         */
        public void setPrice(float value) {
          this.price = value;
        }

        /**
         * Gets the value of the url property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUrl() {
          return url;
        }

        /**
         * Sets the value of the url property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUrl(String value) {
          this.url = value;
        }

        /**
         * Gets the value of the vendor property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVendor() {
          return vendor;
        }

        /**
         * Sets the value of the vendor property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVendor(String value) {
          this.vendor = value;
        }

        /**
         * Gets the value of the available property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getAvailable() {
          return available;
        }

        /**
         * Sets the value of the available property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAvailable(String value) {
          this.available = value;
        }

        /**
         * Gets the value of the id property.
         *
         * @return possible object is
         * {@link Integer }
         */
        public Integer getId() {
          return id;
        }

        /**
         * Sets the value of the id property.
         *
         * @param value allowed object is
         *              {@link Integer }
         */
        public void setId(Integer value) {
          this.id = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "value"
        })
        public static class Param {

          @XmlValue
          protected String value;
          @XmlAttribute(name = "name")
          protected String name;

          /**
           * Gets the value of the value property.
           *
           * @return possible object is
           * {@link String }
           */
          public String getValue() {
            return value;
          }

          /**
           * Sets the value of the value property.
           *
           * @param value allowed object is
           *              {@link String }
           */
          public void setValue(String value) {
            this.value = value;
          }

          /**
           * Gets the value of the name property.
           *
           * @return possible object is
           * {@link String }
           */
          public String getName() {
            return name;
          }

          /**
           * Sets the value of the name property.
           *
           * @param value allowed object is
           *              {@link String }
           */
          public void setName(String value) {
            this.name = value;
          }

        }

      }

    }

  }
}
