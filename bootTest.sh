#!/usr/bin/env bash
pushd demo-ui/
../gradlew clean :demo-ui:test
popd