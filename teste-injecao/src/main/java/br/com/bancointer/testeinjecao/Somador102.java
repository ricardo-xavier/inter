package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador102")
public class Somador102 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
