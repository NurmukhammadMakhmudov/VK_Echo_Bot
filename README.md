# VK Bot Application

Это приложение Spring Boot реализует бота для VK, который цитирует присланный ему текст.

## Требования

- Java 11 или выше
- Maven 3.6.3 или выше
- Ngrok для туннелирования локального сервера

## Конфигурация

Создайте файл `application.properties` в директории `src/main/resources` с следующими параметрами:

```properties
# VK Bot Configuration
vk.access.token=YOUR_ACCESS_TOKEN
vk.callback.answer=YOUR_CONFIRMATION
vk.api.version=5.131


## Запуск

1 Клонируйте репозиторий
2 Соберите и запустите приложение
3 Настройте Ngrok
4 Настройте Webhook в VK (Callback API)
5 Подтвердите сервер
