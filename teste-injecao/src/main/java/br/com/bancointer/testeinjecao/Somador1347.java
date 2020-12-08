package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1347")
public class Somador1347 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
