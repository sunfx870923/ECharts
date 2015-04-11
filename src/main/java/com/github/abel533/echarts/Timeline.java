/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.github.abel533.echarts;

import com.github.abel533.echarts.code.ControlPosition;
import com.github.abel533.echarts.code.TimeLineType;
import com.github.abel533.echarts.style.CheckpointStyle;
import com.github.abel533.echarts.style.ControlStyle;
import com.github.abel533.echarts.style.LineStyle;

/**
 * Description: Timeline
 *
 * @author liuzh
 */
public class Timeline extends AbstractData<Timeline> implements Component {
    /**
     * 默认值true,显示策略，可选为：true（显示） | false（隐藏）
     */
    private Boolean show;
    /**
     * 默认为time,模式是时间类型，时间轴间隔根据时间跨度计算，可选为：'number'
     *
     * @see com.github.abel533.echarts.code.TimeLineType
     */
    private TimeLineType type;
    /**
     * 默认值false,时间轴上多个option切换时是否进行merge操作，同setOption第二个参数
     */
    private Boolean notMerge;
    /**
     * 默认值true,拖拽或点击改变时间轴是否实时显示
     */
    private Boolean realtime;
    /**
     * 默认值80，时间轴左上角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)
     */
    private Object x;
    /**
     * 默认值null,时间轴左上角纵坐标，数值单位px，支持百分比（字符串），
     * 默认无，随y2定位，如'50%'(显示区域纵向中心)
     */
    private Object y;
    /**
     * 默认值80，时间轴右下角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)
     */
    private Object x2;
    /**
     * 默认值null,时间轴右下角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)
     */
    private Object y2;
    /**
     * 默认值 auto
     * 时间轴宽度，默认为总宽度 - x - x2，数值单位px，指定width后将忽略x2。见下图。
     * 支持百分比（字符串），如'50%'(显示区域一半的宽度)
     */
    private Object width;
    /**
     * 默认值50，时间轴高度，数值单位px，支持百分比（字符串），如'50%'(显示区域一半的高度)
     */
    private Object height;
    /**
     * 背景颜色，默认透明(rgba(0,0,0,0))。
     */
    private String backgroundColor;
    /**
     * 默认值#ccc，边框颜色
     */
    private String borderColor;
    /**
     * 默认值0，边框线宽
     */
    private Integer borderWidth;
    /**
     * 默认值5，内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距，同css，见下图
     */
    private Integer padding;
    /**
     * 默认值left,播放控制器位置，可选为：'left' | 'right' | 'none'
     *
     * @see com.github.abel533.echarts.code.ControlPosition
     */
    private ControlPosition controlPosition;
    /**
     * 默认值false,是否自动播放
     */
    private Boolean autoPlay;
    /**
     * 默认值true,是否循环播放
     */
    private Boolean loop;
    /**
     * 默认值2000，播放时间间隔，单位ms
     */
    private Integer playInterval;
    /**
     * 默认值{color: '#666', width: 1, type: 'dashed'}，时间轴轴线样式lineStyle控制线条样式，
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    private LineStyle lineStyle;
    /**
     * @see com.github.abel533.echarts.Label
     */
    private Label label;
    /**
     * 时间轴当前点
     *
     * @see com.github.abel533.echarts.style.CheckpointStyle
     */
    private CheckpointStyle checkpointStyle;
    /**
     * 时间轴控制器样式，可指定正常和高亮颜色
     *
     * @see com.github.abel533.echarts.code.ControlPosition
     */
    private ControlStyle controlStyle;
    /**
     * 默认值emptyDiamond，轴点symbol，同serie.symbol
     *
     * @see com.github.abel533.echarts.code.Symbol
     * @see com.github.abel533.echarts.series.Series#symbol
     */
    private Object symbol;
    /**
     * 默认值4，轴点symbol，同serie.symbolSize
     */
    private Object symbolSize;
    /**
     * 默认值0，当前索引位置，对应options数组，用于指定显示特定系列
     */
    private Integer currentIndex;

    /**
     * 获取show值
     */
    public Boolean show() {
        return this.show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public Timeline show(Boolean show) {
        this.show = show;
        return this;
    }

    /**
     * 获取type值
     */
    public TimeLineType type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public Timeline type(TimeLineType type) {
        this.type = type;
        return this;
    }

    /**
     * 获取notMerge值
     */
    public Boolean notMerge() {
        return this.notMerge;
    }

    /**
     * 设置notMerge值
     *
     * @param notMerge
     */
    public Timeline notMerge(Boolean notMerge) {
        this.notMerge = notMerge;
        return this;
    }

    /**
     * 获取realtime值
     */
    public Boolean realtime() {
        return this.realtime;
    }

    /**
     * 设置realtime值
     *
     * @param realtime
     */
    public Timeline realtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }

    /**
     * 获取x值
     */
    public Object x() {
        return this.x;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public Timeline x(Object x) {
        this.x = x;
        return this;
    }

    /**
     * 获取y值
     */
    public Object y() {
        return this.y;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public Timeline y(Object y) {
        this.y = y;
        return this;
    }

    /**
     * 获取x2值
     */
    public Object x2() {
        return this.x2;
    }

    /**
     * 设置x2值
     *
     * @param x2
     */
    public Timeline x2(Object x2) {
        this.x2 = x2;
        return this;
    }

    /**
     * 获取y2值
     */
    public Object y2() {
        return this.y2;
    }

    /**
     * 设置y2值
     *
     * @param y2
     */
    public Timeline y2(Object y2) {
        this.y2 = y2;
        return this;
    }

    /**
     * 获取width值
     */
    public Object width() {
        return this.width;
    }

    /**
     * 设置width值
     *
     * @param width
     */
    public Timeline width(Object width) {
        this.width = width;
        return this;
    }

    /**
     * 获取height值
     */
    public Object height() {
        return this.height;
    }

    /**
     * 设置height值
     *
     * @param height
     */
    public Timeline height(Object height) {
        this.height = height;
        return this;
    }

    /**
     * 获取backgroundColor值
     */
    public String backgroundColor() {
        return this.backgroundColor;
    }

    /**
     * 设置backgroundColor值
     *
     * @param backgroundColor
     */
    public Timeline backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * 获取borderColor值
     */
    public String borderColor() {
        return this.borderColor;
    }

    /**
     * 设置borderColor值
     *
     * @param borderColor
     */
    public Timeline borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    /**
     * 获取borderWidth值
     */
    public Integer borderWidth() {
        return this.borderWidth;
    }

    /**
     * 设置borderWidth值
     *
     * @param borderWidth
     */
    public Timeline borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    /**
     * 获取padding值
     */
    public Integer padding() {
        return this.padding;
    }

    /**
     * 设置padding值
     *
     * @param padding
     */
    public Timeline padding(Integer padding) {
        this.padding = padding;
        return this;
    }

    /**
     * 获取controlPosition值
     */
    public ControlPosition controlPosition() {
        return this.controlPosition;
    }

    /**
     * 设置controlPosition值
     *
     * @param controlPosition
     */
    public Timeline controlPosition(ControlPosition controlPosition) {
        this.controlPosition = controlPosition;
        return this;
    }

    /**
     * 获取autoPlay值
     */
    public Boolean autoPlay() {
        return this.autoPlay;
    }

    /**
     * 设置autoPlay值
     *
     * @param autoPlay
     */
    public Timeline autoPlay(Boolean autoPlay) {
        this.autoPlay = autoPlay;
        return this;
    }

    /**
     * 获取loop值
     */
    public Boolean loop() {
        return this.loop;
    }

    /**
     * 设置loop值
     *
     * @param loop
     */
    public Timeline loop(Boolean loop) {
        this.loop = loop;
        return this;
    }

    /**
     * 获取playInterval值
     */
    public Integer playInterval() {
        return this.playInterval;
    }

    /**
     * 设置playInterval值
     *
     * @param playInterval
     */
    public Timeline playInterval(Integer playInterval) {
        this.playInterval = playInterval;
        return this;
    }

    /**
     * 默认值{color: '#666', width: 1, type: 'dashed'}，时间轴轴线样式lineStyle控制线条样式，
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }

    /**
     * @see com.github.abel533.echarts.Label
     */
    public Label label() {
        if (this.label == null) {
            this.label = new Label();
        }
        return this.label;
    }

    /**
     * 时间轴当前点
     *
     * @see com.github.abel533.echarts.style.CheckpointStyle
     */
    public CheckpointStyle checkpointStyle() {
        if (this.checkpointStyle == null) {
            this.checkpointStyle = new CheckpointStyle();
        }
        return this.checkpointStyle;
    }

    /**
     * 时间轴控制器样式，可指定正常和高亮颜色
     *
     * @see com.github.abel533.echarts.code.ControlPosition
     */
    public ControlStyle controlStyle() {
        if (this.controlStyle == null) {
            this.controlStyle = new ControlStyle();
        }
        return this.controlStyle;
    }

    /**
     * 获取symbol值
     */
    public Object symbol() {
        return this.symbol;
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public Timeline symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * 获取symbolSize值
     */
    public Object symbolSize() {
        return this.symbolSize;
    }

    /**
     * 设置symbolSize值
     *
     * @param symbolSize
     */
    public Timeline symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    /**
     * 获取currentIndex值
     */
    public Integer currentIndex() {
        return this.currentIndex;
    }

    /**
     * 设置currentIndex值
     *
     * @param currentIndex
     */
    public Timeline currentIndex(Integer currentIndex) {
        this.currentIndex = currentIndex;
        return this;
    }

    /**
     * 获取lineStyle值
     */
    public LineStyle getLineStyle() {
        return lineStyle;
    }

    /**
     * 设置lineStyle值
     *
     * @param lineStyle
     */
    public void setLineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

    /**
     * 获取label值
     */
    public Label getLabel() {
        return label;
    }

    /**
     * 设置label值
     *
     * @param label
     */
    public void setLabel(Label label) {
        this.label = label;
    }

    /**
     * 获取checkpointStyle值
     */
    public CheckpointStyle getCheckpointStyle() {
        return checkpointStyle;
    }

    /**
     * 设置checkpointStyle值
     *
     * @param checkpointStyle
     */
    public void setCheckpointStyle(CheckpointStyle checkpointStyle) {
        this.checkpointStyle = checkpointStyle;
    }

    /**
     * 获取controlStyle值
     */
    public ControlStyle getControlStyle() {
        return controlStyle;
    }

    /**
     * 设置controlStyle值
     *
     * @param controlStyle
     */
    public void setControlStyle(ControlStyle controlStyle) {
        this.controlStyle = controlStyle;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public TimeLineType getType() {
        return type;
    }

    public void setType(TimeLineType type) {
        this.type = type;
    }

    public Boolean getNotMerge() {
        return notMerge;
    }

    public void setNotMerge(Boolean notMerge) {
        this.notMerge = notMerge;
    }

    public Boolean getRealtime() {
        return realtime;
    }

    public void setRealtime(Boolean realtime) {
        this.realtime = realtime;
    }

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }

    public Object getX2() {
        return x2;
    }

    public void setX2(Object x2) {
        this.x2 = x2;
    }

    public Object getY2() {
        return y2;
    }

    public void setY2(Object y2) {
        this.y2 = y2;
    }

    public Object getWidth() {
        return width;
    }

    public void setWidth(Object width) {
        this.width = width;
    }

    public Object getHeight() {
        return height;
    }

    public void setHeight(Object height) {
        this.height = height;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Integer getPadding() {
        return padding;
    }

    public void setPadding(Integer padding) {
        this.padding = padding;
    }

    public ControlPosition getControlPosition() {
        return controlPosition;
    }

    public void setControlPosition(ControlPosition controlPosition) {
        this.controlPosition = controlPosition;
    }

    public Boolean getAutoPlay() {
        return autoPlay;
    }

    public void setAutoPlay(Boolean autoPlay) {
        this.autoPlay = autoPlay;
    }

    public Boolean getLoop() {
        return loop;
    }

    public void setLoop(Boolean loop) {
        this.loop = loop;
    }

    public Integer getPlayInterval() {
        return playInterval;
    }

    public void setPlayInterval(Integer playInterval) {
        this.playInterval = playInterval;
    }

    public Object getSymbol() {
        return symbol;
    }

    public void setSymbol(Object symbol) {
        this.symbol = symbol;
    }

    public Object getSymbolSize() {
        return symbolSize;
    }

    public void setSymbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
    }

    public Integer getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(Integer currentIndex) {
        this.currentIndex = currentIndex;
    }
}
