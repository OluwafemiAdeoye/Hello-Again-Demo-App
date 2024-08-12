package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.events.WebDriverListener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class EventReporter implements WebDriverListener {
    public void beforeAnyCall(Object target, Method method, Object[] args) {
        WebDriverListener.super.beforeAnyCall(target, method, args);
    }

    public void afterAnyCall(Object target, Method method, Object[] args, Object result) {
        WebDriverListener.super.afterAnyCall(target, method, args, result);
    }

    public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
        WebDriverListener.super.onError(target, method, args, e);
    }

    public void beforeAnyWebDriverCall(WebDriver driver, Method method, Object[] args) {
        WebDriverListener.super.beforeAnyWebDriverCall(driver, method, args);
    }

    public void afterAnyWebDriverCall(WebDriver driver, Method method, Object[] args, Object result) {
        WebDriverListener.super.afterAnyWebDriverCall(driver, method, args, result);
    }

    public void beforeGet(WebDriver driver, String url) {
        WebDriverListener.super.beforeGet(driver, url);
    }

    public void afterGet(WebDriver driver, String url) {
        WebDriverListener.super.afterGet(driver, url);
    }

    public void beforeGetCurrentUrl(WebDriver driver) {
        WebDriverListener.super.beforeGetCurrentUrl(driver);
    }

    public void afterGetCurrentUrl(WebDriver driver, String result) {
        WebDriverListener.super.afterGetCurrentUrl(driver, result);
    }

    public void beforeGetTitle(WebDriver driver) {
        WebDriverListener.super.beforeGetTitle(driver);
    }

    public void afterGetTitle(WebDriver driver, String result) {
        WebDriverListener.super.afterGetTitle(driver, result);
    }

    public void beforeFindElement(WebDriver driver, By locator) {
        WebDriverListener.super.beforeFindElement(driver, locator);
    }

    public void afterFindElement(WebDriver driver, By locator, WebElement result) {
        WebDriverListener.super.afterFindElement(driver, locator, result);
    }

    public void beforeFindElements(WebDriver driver, By locator) {
        WebDriverListener.super.beforeFindElements(driver, locator);
    }

    public void afterFindElements(WebDriver driver, By locator, List<WebElement> result) {
        WebDriverListener.super.afterFindElements(driver, locator, result);
    }

    public void beforeGetPageSource(WebDriver driver) {
        WebDriverListener.super.beforeGetPageSource(driver);
    }

    public void afterGetPageSource(WebDriver driver, String result) {
        WebDriverListener.super.afterGetPageSource(driver, result);
    }

    public void beforeClose(WebDriver driver) {
        WebDriverListener.super.beforeClose(driver);
    }

    public void afterClose(WebDriver driver) {
        WebDriverListener.super.afterClose(driver);
    }

    public void beforeQuit(WebDriver driver) {
        WebDriverListener.super.beforeQuit(driver);
    }

    public void afterQuit(WebDriver driver) {
        WebDriverListener.super.afterQuit(driver);
    }

    public void beforeGetWindowHandles(WebDriver driver) {
        WebDriverListener.super.beforeGetWindowHandles(driver);
    }

    public void afterGetWindowHandles(WebDriver driver, Set<String> result) {
        WebDriverListener.super.afterGetWindowHandles(driver, result);
    }

    public void beforeGetWindowHandle(WebDriver driver) {
        WebDriverListener.super.beforeGetWindowHandle(driver);
    }

    public void afterGetWindowHandle(WebDriver driver, String result) {
        WebDriverListener.super.afterGetWindowHandle(driver, result);
    }

    public void beforeExecuteScript(WebDriver driver, String script, Object[] args) {
        WebDriverListener.super.beforeExecuteScript(driver, script, args);
    }

    public void afterExecuteScript(WebDriver driver, String script, Object[] args, Object result) {
        WebDriverListener.super.afterExecuteScript(driver, script, args, result);
    }

    public void beforeExecuteAsyncScript(WebDriver driver, String script, Object[] args) {
        WebDriverListener.super.beforeExecuteAsyncScript(driver, script, args);
    }

    public void afterExecuteAsyncScript(WebDriver driver, String script, Object[] args, Object result) {
        WebDriverListener.super.afterExecuteAsyncScript(driver, script, args, result);
    }

    public void beforePerform(WebDriver driver, Collection<Sequence> actions) {
        WebDriverListener.super.beforePerform(driver, actions);
    }

    public void afterPerform(WebDriver driver, Collection<Sequence> actions) {
        WebDriverListener.super.afterPerform(driver, actions);
    }

    public void beforeResetInputState(WebDriver driver) {
        WebDriverListener.super.beforeResetInputState(driver);
    }

    public void afterResetInputState(WebDriver driver) {
        WebDriverListener.super.afterResetInputState(driver);
    }

    public void beforeAnyWebElementCall(WebElement element, Method method, Object[] args) {
        WebDriverListener.super.beforeAnyWebElementCall(element, method, args);
    }

    public void afterAnyWebElementCall(WebElement element, Method method, Object[] args, Object result) {
        WebDriverListener.super.afterAnyWebElementCall(element, method, args, result);
    }

    public void beforeClick(WebElement element) {
        WebDriverListener.super.beforeClick(element);
        System.out.println("Clicking on " + element.getText());
    }

    public void afterClick(WebElement element) {
        WebDriverListener.super.afterClick(element);
    }

    public void beforeSubmit(WebElement element) {
        WebDriverListener.super.beforeSubmit(element);
    }

    public void afterSubmit(WebElement element) {
        WebDriverListener.super.afterSubmit(element);
    }

    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
        WebDriverListener.super.beforeSendKeys(element, keysToSend);
    }

    public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
        WebDriverListener.super.afterSendKeys(element, keysToSend);
    }

    public void beforeClear(WebElement element) {
        WebDriverListener.super.beforeClear(element);
    }

    public void afterClear(WebElement element) {
        WebDriverListener.super.afterClear(element);
    }

    public void beforeGetTagName(WebElement element) {
        WebDriverListener.super.beforeGetTagName(element);
    }

    public void afterGetTagName(WebElement element, String result) {
        WebDriverListener.super.afterGetTagName(element, result);
    }

    public void beforeGetAttribute(WebElement element, String name) {
        WebDriverListener.super.beforeGetAttribute(element, name);
    }

    public void afterGetAttribute(WebElement element, String name, String result) {
        WebDriverListener.super.afterGetAttribute(element, name, result);
    }

    public void beforeIsSelected(WebElement element) {
        WebDriverListener.super.beforeIsSelected(element);
    }

    public void afterIsSelected(WebElement element, boolean result) {
        WebDriverListener.super.afterIsSelected(element, result);
    }

    public void beforeIsEnabled(WebElement element) {
        WebDriverListener.super.beforeIsEnabled(element);
    }

    public void afterIsEnabled(WebElement element, boolean result) {
        WebDriverListener.super.afterIsEnabled(element, result);
    }

    public void beforeGetText(WebElement element) {
        WebDriverListener.super.beforeGetText(element);
    }

    public void afterGetText(WebElement element, String result) {
        WebDriverListener.super.afterGetText(element, result);
    }

    public void beforeFindElement(WebElement element, By locator) {
        WebDriverListener.super.beforeFindElement(element, locator);
    }

    public void afterFindElement(WebElement element, By locator, WebElement result) {
        WebDriverListener.super.afterFindElement(element, locator, result);
    }

    public void beforeFindElements(WebElement element, By locator) {
        WebDriverListener.super.beforeFindElements(element, locator);
    }

    public void afterFindElements(WebElement element, By locator, List<WebElement> result) {
        WebDriverListener.super.afterFindElements(element, locator, result);
    }

    public void beforeIsDisplayed(WebElement element) {
        WebDriverListener.super.beforeIsDisplayed(element);
    }

    public void afterIsDisplayed(WebElement element, boolean result) {
        WebDriverListener.super.afterIsDisplayed(element, result);
    }

    public void beforeGetLocation(WebElement element) {
        WebDriverListener.super.beforeGetLocation(element);
    }

    public void afterGetLocation(WebElement element, Point result) {
        WebDriverListener.super.afterGetLocation(element, result);
    }

    public void beforeGetSize(WebElement element) {
        WebDriverListener.super.beforeGetSize(element);
    }

    public void afterGetSize(WebElement element, Dimension result) {
        WebDriverListener.super.afterGetSize(element, result);
    }

    public void beforeGetCssValue(WebElement element, String propertyName) {
        WebDriverListener.super.beforeGetCssValue(element, propertyName);
    }

    public void afterGetCssValue(WebElement element, String propertyName, String result) {
        WebDriverListener.super.afterGetCssValue(element, propertyName, result);
    }

    public void beforeAnyNavigationCall(WebDriver.Navigation navigation, Method method, Object[] args) {
        WebDriverListener.super.beforeAnyNavigationCall(navigation, method, args);
    }

    public void afterAnyNavigationCall(WebDriver.Navigation navigation, Method method, Object[] args, Object result) {
        WebDriverListener.super.afterAnyNavigationCall(navigation, method, args, result);
    }

    public void beforeTo(WebDriver.Navigation navigation, String url) {
        WebDriverListener.super.beforeTo(navigation, url);
    }

    public void afterTo(WebDriver.Navigation navigation, String url) {
        WebDriverListener.super.afterTo(navigation, url);
    }

    public void beforeTo(WebDriver.Navigation navigation, URL url) {
        WebDriverListener.super.beforeTo(navigation, url);
    }

    public void afterTo(WebDriver.Navigation navigation, URL url) {
        WebDriverListener.super.afterTo(navigation, url);
    }

    public void beforeBack(WebDriver.Navigation navigation) {
        WebDriverListener.super.beforeBack(navigation);
    }

    public void afterBack(WebDriver.Navigation navigation) {
        WebDriverListener.super.afterBack(navigation);
    }

    public void beforeForward(WebDriver.Navigation navigation) {
        WebDriverListener.super.beforeForward(navigation);
    }

    public void afterForward(WebDriver.Navigation navigation) {
        WebDriverListener.super.afterForward(navigation);
    }

    public void beforeRefresh(WebDriver.Navigation navigation) {
        WebDriverListener.super.beforeRefresh(navigation);
    }

    public void afterRefresh(WebDriver.Navigation navigation) {
        WebDriverListener.super.afterRefresh(navigation);
    }

    public void beforeAnyAlertCall(Alert alert, Method method, Object[] args) {
        WebDriverListener.super.beforeAnyAlertCall(alert, method, args);
    }

    public void afterAnyAlertCall(Alert alert, Method method, Object[] args, Object result) {
        WebDriverListener.super.afterAnyAlertCall(alert, method, args, result);
    }

    public void beforeAccept(Alert alert) {
        WebDriverListener.super.beforeAccept(alert);
    }

    public void afterAccept(Alert alert) {
        WebDriverListener.super.afterAccept(alert);
    }

    public void beforeDismiss(Alert alert) {
        WebDriverListener.super.beforeDismiss(alert);
    }

    public void afterDismiss(Alert alert) {
        WebDriverListener.super.afterDismiss(alert);
    }

    public void beforeGetText(Alert alert) {
        WebDriverListener.super.beforeGetText(alert);
    }

    public void afterGetText(Alert alert, String result) {
        WebDriverListener.super.afterGetText(alert, result);
    }

    public void beforeSendKeys(Alert alert, String text) {
        WebDriverListener.super.beforeSendKeys(alert, text);
    }

    public void afterSendKeys(Alert alert, String text) {
        WebDriverListener.super.afterSendKeys(alert, text);
    }

    public void beforeAnyOptionsCall(WebDriver.Options options, Method method, Object[] args) {
        WebDriverListener.super.beforeAnyOptionsCall(options, method, args);
    }

    public void afterAnyOptionsCall(WebDriver.Options options, Method method, Object[] args, Object result) {
        WebDriverListener.super.afterAnyOptionsCall(options, method, args, result);
    }

    public void beforeAddCookie(WebDriver.Options options, Cookie cookie) {
        WebDriverListener.super.beforeAddCookie(options, cookie);
    }

    public void afterAddCookie(WebDriver.Options options, Cookie cookie) {
        WebDriverListener.super.afterAddCookie(options, cookie);
    }

    public void beforeDeleteCookieNamed(WebDriver.Options options, String name) {
        WebDriverListener.super.beforeDeleteCookieNamed(options, name);
    }

    public void afterDeleteCookieNamed(WebDriver.Options options, String name) {
        WebDriverListener.super.afterDeleteCookieNamed(options, name);
    }

    public void beforeDeleteCookie(WebDriver.Options options, Cookie cookie) {
        WebDriverListener.super.beforeDeleteCookie(options, cookie);
    }

    public void afterDeleteCookie(WebDriver.Options options, Cookie cookie) {
        WebDriverListener.super.afterDeleteCookie(options, cookie);
    }

    public void beforeDeleteAllCookies(WebDriver.Options options) {
        WebDriverListener.super.beforeDeleteAllCookies(options);
    }

    public void afterDeleteAllCookies(WebDriver.Options options) {
        WebDriverListener.super.afterDeleteAllCookies(options);
    }

    public void beforeGetCookies(WebDriver.Options options) {
        WebDriverListener.super.beforeGetCookies(options);
    }

    public void afterGetCookies(WebDriver.Options options, Set<Cookie> result) {
        WebDriverListener.super.afterGetCookies(options, result);
    }

    public void beforeGetCookieNamed(WebDriver.Options options, String name) {
        WebDriverListener.super.beforeGetCookieNamed(options, name);
    }

    public void afterGetCookieNamed(WebDriver.Options options, String name, Cookie result) {
        WebDriverListener.super.afterGetCookieNamed(options, name, result);
    }

    public void beforeAnyTimeoutsCall(WebDriver.Timeouts timeouts, Method method, Object[] args) {
        WebDriverListener.super.beforeAnyTimeoutsCall(timeouts, method, args);
    }

    public void afterAnyTimeoutsCall(WebDriver.Timeouts timeouts, Method method, Object[] args, Object result) {
        WebDriverListener.super.afterAnyTimeoutsCall(timeouts, method, args, result);
    }

    public void beforeImplicitlyWait(WebDriver.Timeouts timeouts, Duration duration) {
        WebDriverListener.super.beforeImplicitlyWait(timeouts, duration);
    }

    public void afterImplicitlyWait(WebDriver.Timeouts timeouts, Duration duration) {
        WebDriverListener.super.afterImplicitlyWait(timeouts, duration);
    }

    public void beforeSetScriptTimeout(WebDriver.Timeouts timeouts, Duration duration) {
        WebDriverListener.super.beforeSetScriptTimeout(timeouts, duration);
    }

    public void afterSetScriptTimeout(WebDriver.Timeouts timeouts, Duration duration) {
        WebDriverListener.super.afterSetScriptTimeout(timeouts, duration);
    }

    public void beforePageLoadTimeout(WebDriver.Timeouts timeouts, Duration duration) {
        WebDriverListener.super.beforePageLoadTimeout(timeouts, duration);
    }

    public void afterPageLoadTimeout(WebDriver.Timeouts timeouts, Duration duration) {
        WebDriverListener.super.afterPageLoadTimeout(timeouts, duration);
    }

    public void beforeAnyWindowCall(WebDriver.Window window, Method method, Object[] args) {
        WebDriverListener.super.beforeAnyWindowCall(window, method, args);
    }

    public void afterAnyWindowCall(WebDriver.Window window, Method method, Object[] args, Object result) {
        WebDriverListener.super.afterAnyWindowCall(window, method, args, result);
    }

    public void beforeGetSize(WebDriver.Window window) {
        WebDriverListener.super.beforeGetSize(window);
    }

    public void afterGetSize(WebDriver.Window window, Dimension result) {
        WebDriverListener.super.afterGetSize(window, result);
    }

    public void beforeSetSize(WebDriver.Window window, Dimension size) {
        WebDriverListener.super.beforeSetSize(window, size);
    }

    public void afterSetSize(WebDriver.Window window, Dimension size) {
        WebDriverListener.super.afterSetSize(window, size);
    }

    public void beforeGetPosition(WebDriver.Window window) {
        WebDriverListener.super.beforeGetPosition(window);
    }

    public void afterGetPosition(WebDriver.Window window, Point result) {
        WebDriverListener.super.afterGetPosition(window, result);
    }

    public void beforeSetPosition(WebDriver.Window window, Point position) {
        WebDriverListener.super.beforeSetPosition(window, position);
    }

    public void afterSetPosition(WebDriver.Window window, Point position) {
        WebDriverListener.super.afterSetPosition(window, position);
    }

    public void beforeMaximize(WebDriver.Window window) {
        WebDriverListener.super.beforeMaximize(window);
    }

    public void afterMaximize(WebDriver.Window window) {
        WebDriverListener.super.afterMaximize(window);
    }

    public void beforeFullscreen(WebDriver.Window window) {
        WebDriverListener.super.beforeFullscreen(window);
    }

    public void afterFullscreen(WebDriver.Window window) {
        WebDriverListener.super.afterFullscreen(window);
    }

    public void beforeAnyTargetLocatorCall(WebDriver.TargetLocator targetLocator, Method method, Object[] args) {
        WebDriverListener.super.beforeAnyTargetLocatorCall(targetLocator, method, args);
    }

    public void afterAnyTargetLocatorCall(WebDriver.TargetLocator targetLocator, Method method, Object[] args, Object result) {
        WebDriverListener.super.afterAnyTargetLocatorCall(targetLocator, method, args, result);
    }

    public void beforeFrame(WebDriver.TargetLocator targetLocator, int index) {
        WebDriverListener.super.beforeFrame(targetLocator, index);
    }

    public void afterFrame(WebDriver.TargetLocator targetLocator, int index, WebDriver driver) {
        WebDriverListener.super.afterFrame(targetLocator, index, driver);
    }

    public void beforeFrame(WebDriver.TargetLocator targetLocator, String nameOrId) {
        WebDriverListener.super.beforeFrame(targetLocator, nameOrId);
    }

    public void afterFrame(WebDriver.TargetLocator targetLocator, String nameOrId, WebDriver driver) {
        WebDriverListener.super.afterFrame(targetLocator, nameOrId, driver);
    }

    public void beforeFrame(WebDriver.TargetLocator targetLocator, WebElement frameElement) {
        WebDriverListener.super.beforeFrame(targetLocator, frameElement);
    }

    public void afterFrame(WebDriver.TargetLocator targetLocator, WebElement frameElement, WebDriver driver) {
        WebDriverListener.super.afterFrame(targetLocator, frameElement, driver);
    }

    public void beforeParentFrame(WebDriver.TargetLocator targetLocator) {
        WebDriverListener.super.beforeParentFrame(targetLocator);
    }

    public void afterParentFrame(WebDriver.TargetLocator targetLocator, WebDriver driver) {
        WebDriverListener.super.afterParentFrame(targetLocator, driver);
    }

    public void beforeWindow(WebDriver.TargetLocator targetLocator, String nameOrHandle) {
        WebDriverListener.super.beforeWindow(targetLocator, nameOrHandle);
    }

    public void afterWindow(WebDriver.TargetLocator targetLocator, String nameOrHandle, WebDriver driver) {
        WebDriverListener.super.afterWindow(targetLocator, nameOrHandle, driver);
    }

    public void beforeNewWindow(WebDriver.TargetLocator targetLocator, WindowType typeHint) {
        WebDriverListener.super.beforeNewWindow(targetLocator, typeHint);
    }

    public void afterNewWindow(WebDriver.TargetLocator targetLocator, WindowType typeHint, WebDriver driver) {
        WebDriverListener.super.afterNewWindow(targetLocator, typeHint, driver);
    }

    public void beforeDefaultContent(WebDriver.TargetLocator targetLocator) {
        WebDriverListener.super.beforeDefaultContent(targetLocator);
    }

    public void afterDefaultContent(WebDriver.TargetLocator targetLocator, WebDriver driver) {
        WebDriverListener.super.afterDefaultContent(targetLocator, driver);
    }

    public void beforeActiveElement(WebDriver.TargetLocator targetLocator) {
        WebDriverListener.super.beforeActiveElement(targetLocator);
    }

    public void afterActiveElement(WebDriver.TargetLocator targetLocator, WebDriver driver) {
        WebDriverListener.super.afterActiveElement(targetLocator, driver);
    }

    public void beforeAlert(WebDriver.TargetLocator targetLocator) {
        WebDriverListener.super.beforeAlert(targetLocator);
    }

    public void afterAlert(WebDriver.TargetLocator targetLocator, Alert alert) {
        WebDriverListener.super.afterAlert(targetLocator, alert);
    }
}