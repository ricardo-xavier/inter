package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador892")
public class Somador892 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
