package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador158")
public class Somador158 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
